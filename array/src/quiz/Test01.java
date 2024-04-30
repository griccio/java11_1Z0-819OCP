package quiz;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args){

        //example of valid initialization
        int myIntArray[] = new int[10];
        int[] mySecondArray[] = new int[10][10];
        int[] myThirdArray = {};
        int[] a = new int[]{1,2,3,4,5};
        int[] matrix[] ={{1,2},{1,2},{1,2},{1,2}};
        int[][] matrix2 = new int[2][2];
        int[][] matrix3 = new int[3][];

        //comparison
        int[] first = {1,2,3,4,5};
        int[] second = {1,2,3,4,5};
        int[] third = {5,4,3,2,1};
        int[] fourth = first;

//        System.out.println(Arrays.equals(first,second));
//        System.out.println(Arrays.equals(first,third));
//        System.out.println(Arrays.equals(first,fourth));
//
//        System.out.println("Compare");
//        System.out.println(Arrays.compare(first,second));
//        System.out.println(Arrays.compare(first,third));
//        System.out.println(Arrays.compare(first,fourth));
//
//        int array1[]={1,2,3};
//        int array2[]={1,2,2};
//        System.out.println(Arrays.compare(array1,array2));

        int array1_1[]={1,2,3,4,5};
        int array1_2[]={5,6,7,8,7,8,9};
        System.out.println(Arrays.compare(array1_1,array1_2));

        String array11[]={"abc","def"};
        String array12[]={"abc"};
        System.out.println(Arrays.compare(array11,array12));

        String array21[]={"ab",};
        String array22[]={"g"};
        System.out.println(array21[0].compareTo(array22[0]));
        System.out.println(array22[0].compareTo(array21[0]));

        String array31[]={"abcde"};
        String array32[]={"abcdh"};
        System.out.println(Arrays.compare(array31,array32));
        System.out.println(array31[0].compareTo(array32[0]));
        System.out.println(Arrays.compare(array32,array31));
        System.out.println(array32[0].compareTo(array31[0]));
    }
}
