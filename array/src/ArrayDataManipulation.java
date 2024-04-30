import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayDataManipulation {

    public static void main(String[] args){
    Integer[] intArray = new Integer[10];
    System.out.println("Array is: " + Arrays.toString(intArray));
    Arrays.fill(intArray, 10);
    System.out.println("Array is: " + Arrays.toString(intArray));

    Arrays.fill(intArray,0,4,100);
    System.out.println("Array is: " + Arrays.toString(intArray));

    Arrays.setAll(intArray, (val) -> val+1);
    System.out.println("Array is: " + Arrays.toString(intArray));

    Arrays.sort(intArray, Collections.reverseOrder());
    System.out.println("Array is: " + Arrays.toString(intArray));

    Arrays.parallelPrefix(intArray, (left,right)->left+right);
    System.out.println("Array is: " + Arrays.toString(intArray));
    }
}
