import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListTransformation {
    public static void main(String[] args){
        Integer[] integerArray = new Integer[10];
        Arrays.setAll(integerArray,(index) ->index+1);
        System.out.println("integerArray: " + Arrays.toString(integerArray));

        List<Integer> anotherList = List.of(integerArray);
        //create asubList of a List
        List<Integer> subList = anotherList.subList(3,7);
        System.out.println("subList: " + subList);

        Integer[] repeatedArray = new Integer[10];
        anotherList.toArray(repeatedArray);
        System.out.println("repeatedArray: " + Arrays.toString(repeatedArray));

        ListIterator lit = anotherList.listIterator();
         for(int i=0; lit.hasNext(); i++){
             System.out.println(lit.next());
             if(i==4){
                 System.out.println("reverse order");
                 for(; lit.hasPrevious();){
                     System.out.print(lit.previous());
                 }
             }
         }
    }
}
