public class MySampleString {
    public static void main(String[] args) {
        String str = "*";
        str = str.repeat(5);
        System.out.println(str);

        String [] arr1 = {null, null};
        System.out.println("1. " + String.join("::", arr1));
//        System.out.println("1. " + String.join("::", null));

        str = "USER GENERATED aaa";

        str = String.join(",","sss"," eee eee"," 44 44 4 4");
        str.split("E",4);
        System.out.println(str);
        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1 && flag2);

    }
}
