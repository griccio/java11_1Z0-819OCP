package myexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayComparison {

    public static void main(String[] args) {

        String[] colors = {"white", "blue", "black", "yellow", "green", "brown", "violet"};
        String[] colorsOrdered = new String[]{"white", "blue", "black", "yellow", "green", "brown", "violet"};
        Arrays.sort(colorsOrdered);
        System.out.println("colors Array is " + Arrays.toString(colors));
        System.out.println("colorsOrdered Array is " + Arrays.toString(colorsOrdered));

        //SEARCH METHOD
        String searchColor = "blue";
        System.out.println(Arrays.binarySearch(colorsOrdered,searchColor));
        System.out.println("IS " + searchColor + " into the colors array? " +( Arrays.binarySearch(colorsOrdered,searchColor)==1 ? "YES": "NO"));
        searchColor = "grey";
        System.out.println(Arrays.binarySearch(colorsOrdered,searchColor));
        System.out.println("IS " + searchColor + " into the colors array? " +( Arrays.binarySearch(colorsOrdered,searchColor)==1 ? "YES": "NO"));

        //DATA MANIPULATION
        Arrays.setAll(colors, index -> colors[index].toUpperCase());
        System.out.println("colors Array is " + Arrays.toString(colors));
        Arrays.setAll(colors, index -> (colors[index]+="ish").toUpperCase());
        System.out.println("colors Array is " + Arrays.toString(colors));
        Arrays.sort(colors, Collections.reverseOrder());
        System.out.println("colors Array is " + Arrays.toString(colors));
        //DATA MANIPULATION WITH LIST
        List<String> colorsList = Arrays.asList(colors);
        System.out.println("colorsList  " + colorsList);
        colorsList.sort(null);
        System.out.println("colorsList  " + colorsList);

        /* this is an error
        colorsList.add("cyan");
        System.out.println("colorsList  " + colorsList);
         */

        List newColorsList = List.of(colors);
        System.out.println("newColorsList  " + newColorsList);

        List newColorsList2 = List.copyOf(newColorsList);

        /*this is an error*/
        /*newColorsList2.sort(null);*/
        System.out.println("newColorsList2  " + newColorsList2);


    }
}
