import java.util.Arrays;
import java.util.List;

public class ArrayComparison{

	public static void main(String[] args){

		String[] firstString = {"abc","def","ghi","jkl","mno","pqr","stu","vwx", "yz"};
		String[] copyOfFirstString = {"abc","def","ghi","jkl","mno","pqr","stu","vwx", "yz"};
		String[] firstUnsortedString = {"abc","yz","pqr","ghi","jkl","def","vwx","mno","stu"};
		String[] firstPartialString = {"abc","def","ghi","jkl","mno"};
		String firstReferenceString[] = firstString;

		List firstList = Arrays.asList(firstString);
		List secondList = Arrays.asList(copyOfFirstString);
		List thirdList = Arrays.asList(firstUnsortedString);


		//compare arrays using object.equals
		System.out.println("------- Object.equals-------------");
		System.out.println("firstString.equals(copyOfFirstString)" + firstString.equals(copyOfFirstString));
		System.out.println("firstString.equals(firstReferenceString)" + firstString.equals(firstReferenceString));
		//compare using Arrays.equals
		System.out.println("------- Arrays equals-------------");
		System.out.println("Arrays.equals(firstString,copyOfFirstString)" + Arrays.equals(firstString,copyOfFirstString));
		System.out.println("Arrays.equals(firstString,firstUnsortedString)" + Arrays.equals(firstString,firstUnsortedString));
		System.out.println("Arrays.equals(firstString,firstReferenceString)" + Arrays.equals(firstString,firstReferenceString));
		//compare using Arrays.compare
		System.out.println("------- Arrays equals-------------");
		System.out.println("Arrays.compare(firstString,copyOfFirstString)" + Arrays.compare(firstString,copyOfFirstString));
		System.out.println("Arrays.compare(firstString,firstUnsortedString) expected (d-y)->(4-25) ->-21" + Arrays.compare(firstString,firstUnsortedString));
		System.out.println("Arrays.compare(firstString,firstReferenceString)" + Arrays.compare(firstString,firstReferenceString));
		//compareTo
		System.out.println("------- [index].compareTo-------------");
		System.out.println("firstString[0].compareTo(firstStringUnsorted[0]) expected (d-y)->(4-25) ->-21" + firstString[1].compareTo(firstUnsortedString[1]));
		System.out.println("firstString[0].compareTo(firstStringUnsorted[0]) expected (d-g)->(4-7) ->-3" + firstString[1].compareTo(firstString[2]));
		System.out.println("------- List.equals-------------");
		System.out.println("firstList.equals(secondList) =" + firstList.equals(secondList));//list comparison
		System.out.println("firstList.equals(secondList) =" + firstList.equals(thirdList));//list comparison






	}
}
