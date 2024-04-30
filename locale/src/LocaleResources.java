/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 16:  Localization
Topic:  Resource Bundles
*/

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleResources {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "AU"));

        testProperties(Locale.getDefault());

        testProperties(Locale.CANADA_FRENCH);
        testProperties(Locale.US);

        testProperties(Locale.GERMANY);

        testProperties(Locale.ITALY);
        testProperties(new Locale("it","IT"));

        testProperties(new Locale("en", "US", "slang"));
    }

    public static void testProperties(Locale locale) {

        System.out.println("---- Locale Passed: [" + locale
                + "] ---------");
        ResourceBundle localeData = ResourceBundle.getBundle(
                "firstBundle", locale);
        System.out.println("\tResourceBundle class = " +
                localeData.getClass().getName());
        // Get the 'selected' locale
        System.out.println("\tLocale Actually Used:  [" +
                localeData.getLocale() + "]");
        // Get a single valued based on a key
        System.out.println("\tInternationalizing the word yes  = " +
                localeData.getString("yes") + " [" + locale + "]");
        System.out.println("\t---Key/Values in properties file---");
        // Iterate through keys and do something
        localeData.keySet().forEach((s) ->
                System.out.println("\t" + s + " = " +
                        localeData.getObject(s)));
    }
}
/**
 ---- Locale Passed: [en_AU] ---------
 ResourceBundle class = java.util.PropertyResourceBundle
 Locale Actually Used:  []
 Internationalizing the word yes  = YES [en_AU]
 ---Key/Values in properties file---
 no = NO
 unsure = UNCERTAIN
 yes = YES
 ---- Locale Passed: [fr_CA] ---------
 ResourceBundle class = java.util.PropertyResourceBundle
 Locale Actually Used:  [fr]
 Internationalizing the word yes  = OUI [fr_CA]
 ---Key/Values in properties file---
 no = NON
 unsure = PAS SURE D QUELQUE CHOSE
 yes = OUI
 ---- Locale Passed: [en_US] ---------
 ResourceBundle class = java.util.PropertyResourceBundle
 Locale Actually Used:  []
 Internationalizing the word yes  = YES [en_US]
 ---Key/Values in properties file---
 no = NO
 unsure = UNCERTAIN
 yes = YES
 ---- Locale Passed: [de_DE] ---------
 ResourceBundle class = java.util.PropertyResourceBundle
 Locale Actually Used:  []
 Internationalizing the word yes  = YES [de_DE]
 ---Key/Values in properties file---
 no = NO
 unsure = UNCERTAIN
 yes = YES
 ---- Locale Passed: [en_US_slang] ---------
 ResourceBundle class = java.util.PropertyResourceBundle
 Locale Actually Used:  [en_US_slang]
 Internationalizing the word yes  = YEAH YEAH YEAH [en_US_slang]
 ---Key/Values in properties file---
 no = NOPE
 unsure = DUNNO
 yes = YEAH YEAH YEAH

 Process finished with exit code 0

 */