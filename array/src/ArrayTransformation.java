import java.util.Arrays;

public class ArrayTransformation {

	public static void main(String[] args){

		Integer[] originalArray = new Integer[10];
		Arrays.setAll(originalArray,(index) ->index+1);
		System.out.println("integer Array: " + Arrays.toString(originalArray));

		Integer[] copiedArray = Arrays.copyOf(originalArray,originalArray.length);
		System.out.println("copied Array: " + Arrays.toString(copiedArray));

		//copy of array with a smaller size
		Integer[] smallerArray = Arrays.copyOf(originalArray,5);
		System.out.println("smaller Array: " + Arrays.toString(smallerArray));

		Integer[] biggerArray = Arrays.copyOf(originalArray,30);
		Arrays.fill(biggerArray,100);
		System.out.println("bigger Array: " + Arrays.toString(biggerArray));

		//get a portion od an array
		Integer[] croppedArray = Arrays.copyOfRange(originalArray,2,4);
		System.out.println("cropped Array: " + Arrays.toString(croppedArray));
	}

}
