import java.util.Arrays;


public class ArrayFirstExample{


	public static void main(String[] args){

		int[] intArray = new int[5];
		Integer[] integerArray = new Integer[5];

		//print default values
		System.out.println("int Arrays: " + Arrays.toString(intArray));
		System.out.println("Integer Array:"+ Arrays.toString(integerArray));

		//init the arrays
		for(var i=0; i < intArray.length; i++){
			intArray[i] = integerArray[i] = i+1;
		}

		System.out.println("Both the Arrays after the initialisation loop ");
		System.out.println("int Arrays: " + Arrays.toString(intArray));
		System.out.println("Integer Array:"+ Arrays.toString(integerArray));

		//access to an element of the array
		intArray[2]=10;
		integerArray[0] = 99;
		System.out.println("Final values are:");
		System.out.println("int Arrays: " + Arrays.toString(intArray));
		System.out.println("Integer Array:"+ Arrays.toString(integerArray));

		//create new int[] variable and assign it intArray
		int[] intArray2 = intArray;
		//create new Integer[] variable and assign it IntegerArray
		Integer[] integerArray2 = integerArray;

		System.out.println("int Arrays2: " + Arrays.toString(intArray2));
		System.out.println("Integer Array2:"+ Arrays.toString(integerArray2));

		//access to an element of the array
		intArray2[3]=33;
		integerArray2[2] = 100;

		System.out.println("Final values after changing array2 are:");
		System.out.println("intArray " + intArray);
		System.out.println("intArray2 " + intArray2);
		System.out.println("integerArray " + integerArray);
		System.out.println("integerArray2 " + integerArray2);
		System.out.println("int Arrays: " + Arrays.toString(intArray));
		System.out.println("Integer Array:"+ Arrays.toString(integerArray));
		System.out.println("int Arrays2: " + Arrays.toString(intArray2));
		System.out.println("Integer Array2:"+ Arrays.toString(integerArray2));

	}

}