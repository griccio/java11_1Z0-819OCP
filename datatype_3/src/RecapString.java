public class RecapString {
    public static void main(String[] args){
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println("s1 and s2 are  new String. Equal is  false :" +s1 == s2);
        s1 = s1.intern();
        s2 = s2.intern();
        System.out.println(s1 == s2);
        String s3 = "ciao mondo";
        String s4 = "ciao mondo";
        System.out.println(s3 == s4);
        String s5 = new String("Hello").intern();
        String s6 = "Hello";
        System.out.println(s5 == s6);

        //Comparison
        String mystr = "Hello World";
        System.out.println(mystr.compareTo("Hello"));


        //isEmpty
        String blankString = "    ";
        String emptyString = "";
        System.out.println(" is emptyString blank? " + emptyString.isBlank());
        System.out.println(" is emptyString empty? " + emptyString.isEmpty());
        System.out.println(" is blankString blank? " + blankString.isBlank());
        System.out.println(" is blankString empty? " + blankString.isEmpty());


        String sr;
        System.out.println( (sr = "Hello" ) == "Hello" );
//        System.out.println( sr = "Hello"  == "Hello" ); //ERROR

    }
}
