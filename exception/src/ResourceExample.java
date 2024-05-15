/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 2: Exception Handling and Assertions
Topic:  Use try-with-resources construct
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceExample {

    // Method demonstrates problems with try/catch/finally clauses.
    private String getPropertyFromFile(String filename,
                                       String propertyName)
            throws IOException {

        String property = null;
        BufferedReader br = null;
        try {
            // if file not found, this line will throw an exception
            // and the variable br will remain null.
            br = new BufferedReader(new FileReader(filename));
            String line;
            String name;
            while ((line = br.readLine()) != null) {
                name = line.split("\\s")[0];
                if (name.equals(propertyName)) {
                    property = line.split("\\s")[1];
                }
            }
        } catch (Exception e) {
            System.out.println("------ Actual Code Throws this error:");
            e.printStackTrace();
            throw e;
        } finally {

            // br is null if file does not exist so following statement
            // generates new error, possibly suppressing original
            br.close();
        }

        return property;
    }
// This method shows the try-with-resources feature
    private String getPropertyValueFromFile(String filename,
                                            String propertyName)
            throws IOException {

        String property = null;

        // In the try-with-resources construct, the resource is
        // automatically closed.
        try (BufferedReader br =
                     new BufferedReader(new FileReader(filename))) {
            String line;
            String name;
            while ((line = br.readLine()) != null) {
                name = line.split("\\s")[0];
                if (name.equals(propertyName)) {
                    property = line.split("\\s")[1];
                }
            }
        }
        return property;
    }

    public static void main(String[] args) throws IOException {
        ResourceExample rex = new ResourceExample();
        String propertyName = "FIRST";
        try {
            String property = rex.getPropertyValueFromFile(
                    "properties.txt", propertyName);
            System.out.println("The value of the property " + propertyName +
                    " = " + property);
        } catch (Exception e) {
            System.out.println("------ Surrounding Code Sees this Error:");
            // Printing exception confirms that exception thrown NOT
            // FileNotFoundException but NullPointerException
            e.printStackTrace();
        }
    }
}
/**
 ------ Actual Code Throws this error:
 ------ Surrounding Code Sees this Error:
 getPropertyFromFile
 java.io.FileNotFoundException: properties.txt (No such file or directory)
 at java.base/java.io.FileInputStream.open0(Native Method)
 at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
 at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
 at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
 at java.base/java.io.FileReader.<init>(FileReader.java:60)
 at ResourceExample.getPropertyFromFile(ResourceExample.java:24)
 at ResourceExample.main(ResourceExample.java:51)
 java.lang.NullPointerException
 at ResourceExample.getPropertyFromFile(ResourceExample.java:41)
 at ResourceExample.main(ResourceExample.java:51)

getPropertyValueFromFile
 ------ Surrounding Code Sees this Error:
 java.io.FileNotFoundException: properties.txt (No such file or directory)
 at java.base/java.io.FileInputStream.open0(Native Method)
 at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
 at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
 at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
 at java.base/java.io.FileReader.<init>(FileReader.java:60)
 at ResourceExample.getPropertyValueFromFile(ResourceExample.java:55)
 at ResourceExample.main(ResourceExample.java:73)

 */