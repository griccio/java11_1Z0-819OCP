public class StringTextSearch {
    public static void main(String[] args){
        String fulltext = "testwordtestwordtestwordtestword";
        String showIndex = "012345678901234567890123";
        String search = "word";

        int lastIndex = fulltext.lastIndexOf(search);
        System.out.println("lastIndex = " + lastIndex);


        lastIndex = fulltext.lastIndexOf(search,11);
        System.out.println("lastIndex = " + lastIndex);


    }
}
