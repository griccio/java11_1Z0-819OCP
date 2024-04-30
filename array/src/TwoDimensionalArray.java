import java.util.Arrays;

public class TwoDimensionalArray {

	public static void printArray(int[][] inputArray){
		System.out.println("-----------------------");
		for (int row = 0; row < inputArray.length; row++){
			printRow(inputArray[row],row);
		}
	}

	public static void printRow(int[] inputArray, int row){
		System.out.println("String row: "+ row + " " + Arrays.toString(inputArray));
	}

	public static void main(String[] args){
		int[][] myArray = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		printArray(myArray);

		int[][] variableColsArray = {{1,2,3,4,5,6},{7,8,10},{1,2,3,66}};
		printArray(variableColsArray);


		//sample of two-dimensional Array clone
		int[][] clonedArray= myArray.clone();
		printArray(clonedArray);

		int[][] copiedArray = (int[][])Arrays.copyOf(myArray,myArray.length);
		printArray(clonedArray);

		copiedArray[1][1] = 1000;
		//copy and cloning are shallow copy
		System.out.println("myArray");
		printArray(myArray);
		System.out.println("copiedArray");
		printArray(copiedArray);
		System.out.println("cloneArray");
		printArray(clonedArray);

		//deep copy
		for(int i=0; i < clonedArray.length; i++){
			clonedArray[i] = clonedArray[i].clone();
		}
		copiedArray[1][0] = 1000;
		copiedArray[2][0] = 2000;
		copiedArray[3][0] = 3000;
		//copy and cloning are shallow copy
		System.out.println("myArray");
		printArray(myArray);
		System.out.println("copiedArray");
		printArray(copiedArray);
		System.out.println("clonedArray");
		printArray(clonedArray);



	}

}
