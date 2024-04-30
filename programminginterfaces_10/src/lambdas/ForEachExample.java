package lambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExample {

    public static String setValue(int indx){
        int intA = 65;
        int multiplier = indx/26;
        int cntr = indx - (multiplier * 26);
        return (char)(cntr + intA) + "_TEST_" + (indx +1);
    }


    public static void main(String[] args){
        for (int i =0 ; i<100 ; i++){
            System.out.println(setValue(i));
        }

        String[] stringArray = new String[100];
        Arrays.setAll(stringArray,ForEachExample::setValue);

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(list);

        list.stream().filter(s ->s.startsWith("A") || s.startsWith("B"))
                        .forEach(System.out::println);

        list.sort(
                (a,b) ->{
                    return Integer.valueOf(b.split("_")[2]).compareTo(Integer.valueOf(a.split("_")[2]));
                }
        );
        System.out.println(list);




    }
}
