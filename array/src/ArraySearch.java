import java.util.Arrays;
import java.util.List;

public class ArraySearch {

    public static void main(String[] args) {

        String[] firstString = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};
        String[] firstUnsortedString = {"abc", "yz", "pqr", "ghi", "jkl", "def", "vwx", "mno", "stu"};
        String[] firstPartialString = {"abc", "def", "ghi", "jkl", "mno"};


        List firstList = Arrays.asList(firstString);
        List thirdList = Arrays.asList(firstUnsortedString);

        System.out.println("------- Arrays Binary search -------------");
        String searchString="stu";
        System.out.println("Arrays.binarySearch(firstString,searchString) " + Arrays.binarySearch(firstString,searchString));
        System.out.println("Arrays.binarySearch(firstUnsortedString,searchString) " + Arrays.binarySearch(firstUnsortedString,searchString));

        //Array mismatch
        System.out.println("Arrays.mismatch(firstString,new String[]{abc,def}) expected value 2: " + Arrays.mismatch(firstString,new String[]{"abc","def"}));
        System.out.println("Arrays.mismatch(firstString,new String[]{abc,def,ghi}) expected value 3: " + Arrays.mismatch(firstString,new String[]{"abc","def","ghi"}));

        //List search
        System.out.println("firstList.contains(Arrays.asList(new String[]{abc}) expected value true : " +
                firstList.contains("abc"));

        System.out.println("firstList.contains(Arrays.asList(new String[]{aaa,def,ggg,www}) expected value false: " +
                firstList.containsAll(Arrays.asList(new String[]{"aaa","def","ggg","www"})));

        System.out.println("firstList.contains(Arrays.asList(new String[]{aaa,def,ggg,www}) expected value true: " +
                firstList.containsAll(Arrays.asList(new String[]{"abc","def"})));


    }
}

