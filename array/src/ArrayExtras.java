import java.util.Arrays;

public class ArrayExtras{

	public static void main(String[] args){

		int a = 100;
		int b = 200;

		int[] intArray = {1,2,3,4,5};
		// you can assign an int to a long
		long myLong = a;

		//
		long[] longArray = {1,2,3,4,5};
		System.out.println(Arrays.toString(longArray));

		long[] myLongArray = new long[2];
		myLongArray[0] = a;
		myLongArray[0] = b; 

		//autobox
		Integer aInteger = a;
		Integer bInteger = b;

		Integer[] integerArray = {0,1,2,3,4};
		System.out.println(Arrays.toString(integerArray));


		//you can mix and match Integer and int
		Integer[] myIntegerArray = new Integer[2];
		myIntegerArray[0] = a;
		myIntegerArray[1] = bInteger;

		System.out.println(Arrays.toString(myIntegerArray));
		
		//this doesn't compile
//		Long[] newLongArray = new long[100];
//		Integer[] newIntegerArray = new int[100];

//		int mismatch = Arrays.mismatch(integerArray, intArray);
//		boolean same = Arrays.equals(integerArray, intArray);
//		int same = Arrays.compare(integerArray, intArray);

//		int mismatch = Arrays.mismatch(integerArray, intArray);
//		boolean same = Arrays.equals(integerArray, intArray);
//		int compare = Arrays.compare(integerArray, intArray);
		Number[] numberArray = new Number[10];
		int mismatch = Arrays.mismatch(integerArray, numberArray);
		boolean same = Arrays.equals(integerArray, numberArray);
//		int compare = Arrays.compare(integerArray, numberArray);

		Long[] newLongArray = new Long[2];
		Short[] newShortArray = new Short[2];
		boolean same2 = Arrays.equals(newShortArray, newLongArray);
	}

}