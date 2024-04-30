/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 4: Generics and Collections
Topic:  Collections, Lists, ArrayList
*/

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        // Create an ArrayList
        List<String> namesList = new ArrayList<>(
                List.of("Anne", "Michael","Barry", "Charles", "David", "Edward")
        );

        System.out.println("---- Executing Methods on Collections ----");
        doStuffWithCollection(namesList, "Fred", "David", "David");
        System.out.println("\n----- Executing Methods on List -----");
        doSimpleListStuff(namesList);

        System.out.println("\n----- The subList View -----");
        //This grabs the names that start with A's using indices
        // First index is inclusive, Last index is exclusive so 3 elements
        List<String> shortList = namesList.subList(1, 4);
        System.out.println("namesList: " + namesList);
        System.out.println("shortList: " + shortList);

        //  Reverse the order of the A List
        System.out.println("\n----- Reverse the order of the A List -----");
        shortList.sort(Comparator.reverseOrder());
        System.out.println("shortList: " + shortList);
        System.out.println("namesList: " + namesList);

        // What if we alter the view?
        System.out.println("\n----- Add element to subList View -----");
        shortList.add("Aryn");
        System.out.println("shortList: " + shortList);
        System.out.println("namesList: " + namesList);

        // This implements sort of subList, using method reference
        System.out.println("\n-----This implements sort of subList, using method reference -----");
        shortList.sort(String::compareTo);
        System.out.println("shortList: " + shortList);
        System.out.println("namesList: " + namesList);
        // What if we alter the source list?
        System.out.println("\n----- Added Brad to namesList -----");

        namesList.add(6, "Brad");
        System.out.println("namesList = " + namesList);
        try{
            System.out.println("shortList = " + shortList);
        }catch(ConcurrentModificationException e){
            System.out.println("shortList no longer exist " + e);
        }
        System.out.println("\n---- copyOf() method copy ----");
        // Use of copyOf
        List<String> copiedList = List.copyOf(namesList);
        System.out.println("copiedList: " + copiedList);

        List newList = new ArrayList(copiedList);
        newList.add("Ralph");

        try{
            copiedList.add("Ralph");
        }catch(Exception e){
            System.out.println("cannot add Ralph to copiedList " + e + newList);
        }

        newList.add(3,null);
        try{
            List myNewList = List.copyOf(newList);
        }catch(Exception e){
            System.out.println("cannot copy newList because has a null value "+ e  + newList);
        }

        try{
            List myNewList = List.of(newList);
            System.out.println("newList copied correctly"+ myNewList);
            System.out.println("newList[0] ="+ myNewList.get(0));
        }catch(Exception e){
            System.out.println("cannot copy newList because has a null value "+ e  + newList);
        }

        newList.remove(null);
        try{
            List myNewList = List.copyOf(newList);
            System.out.println("newList[0] ="+ myNewList.get(0));
        }catch(Exception e){
            System.out.println("cannot copy newList because has a null value "+ e  + newList);
        }
    }


    public static <T> void doStuffWithCollection(Collection<T> h,
                                                 T addedValue1, T addedValue2,
                                                 T removedValue) {
        // Check if adding a null is valid or throws exception
        System.out.println("Start of method: " + h);
        try {
            System.out.println("After adding null " +
                    h.add(null) + " : " + h);
        } catch (Exception e) {
            System.out.println("Exception adding null: " +
                    e);
        }

        // Add an element
        System.out.println("After adding " + addedValue1 +
                " " + h.add(addedValue1) + " : " + h);

        //  Check if adding duplicate element is valid
        System.out.println("After adding " + addedValue2 +
                " " + h.add(addedValue2) + " : " + h);

        // Remove an element
        System.out.println("After removing  " + removedValue +
                " " + h.remove(removedValue) + " : " + h);

        try {
            System.out.println("After removing null " +
                    h.remove(null) + " : " + h);
        } catch (Exception e) {
            System.out.println("Exception removing null " +
                    e);
        }

        // Test bulk functions
        performBulkFunctionsString((Collection<String>) h);
    }

    private static void performBulkFunctionsString(Collection<String> h) {
        // Perform some bulk functions...
        System.out.println("After addSeveral:" +
                h.addAll(List.of("George", "Harry", "Isabel"))
                + " : " + h);
        System.out.println("containAll(Fred ,Harry, Isabel) : " +
                h.containsAll(List.of("Fred", "Harry", "Isabel"))
                + " : " + h);
        System.out.println("containAll(Anne ,Harry, Isabel) : " +
                h.containsAll(List.of("Anne", "Harry", "Isabel"))
                + " : " + h);
        try {
            System.out.println("After removeSeveral:" +
                    h.removeAll(List.of("Harry", "Isabel")) + " : " + h);
        } catch (Exception e) {
            System.out.println("Exception removing containAll " +
                    e);
        }

        try {
            System.out.println("After retainAll:" +
                    h.retainAll(List.of("Barry", "Charles",
                            "David", "Edward"))
                    + " : " + h);
        } catch (Exception e) {
            System.out.println("Exception with retainAll " +
                    e);
        }
    }

    // Methods associated with the List interface.
    private static void doSimpleListStuff(List<String> list) {

        // You'll note that add does not return a boolean.
        list.add(0, "Arnold");

        System.out.println("After adding Arnold at index 0 :" +
                " : " + list);

        System.out.println("After adding others at index 0 : " +
                list.addAll(0, List.of("Aaron", "Able")) + " : " + list);

        System.out.println("Setting name at index 2 : " +
                list.set(2, "Annette") + " : " + list);

        System.out.println("Arnold can be found at : " +
                list.indexOf("Arnold"));

        System.out.println("Annette can be found at : " +
                list.indexOf("Annette"));

        list.add(0, "David");
        System.out.println("After adding David at index 0 :" +
                " : " + list);

        System.out.println("The last David can be found at index : " +
                list.lastIndexOf("David"));
    }

}
/**

 ---- Executing Methods on Collections ----
 Start of method: [Anne, Michael, Barry, Charles, David, Edward]
 After adding null true : [Anne, Michael, Barry, Charles, David, Edward, null]
 After adding Fred true : [Anne, Michael, Barry, Charles, David, Edward, null, Fred]
 After adding David true : [Anne, Michael, Barry, Charles, David, Edward, null, Fred, David]
 After removing  David true : [Anne, Michael, Barry, Charles, Edward, null, Fred, David]
 After removing null true : [Anne, Michael, Barry, Charles, Edward, Fred, David]
 After addSeveral:true : [Anne, Michael, Barry, Charles, Edward, Fred, David, George, Harry, Isabel]
 containAll(Fred ,Harry, Isabel) : true : [Anne, Michael, Barry, Charles, Edward, Fred, David, George, Harry, Isabel]
 containAll(Anne ,Harry, Isabel) : true : [Anne, Michael, Barry, Charles, Edward, Fred, David, George, Harry, Isabel]
 After removeSeveral:true : [Anne, Michael, Barry, Charles, Edward, Fred, David, George]
 After retainAll:true : [Barry, Charles, Edward, David]

 ----- Executing Methods on List -----
 After adding Arnold at index 0 : : [Arnold, Barry, Charles, Edward, David]
 After adding others at index 0 : true : [Aaron, Able, Arnold, Barry, Charles, Edward, David]
 Setting name at index 2 : Arnold : [Aaron, Able, Annette, Barry, Charles, Edward, David]
 Arnold can be found at : -1
 Annette can be found at : 2
 After adding David at index 0 : : [David, Aaron, Able, Annette, Barry, Charles, Edward, David]
 The last David can be found at index : 7

 ----- The subList View -----
 namesList: [David, Aaron, Able, Annette, Barry, Charles, Edward, David]
 shortList: [Aaron, Able, Annette]

 ----- Reverse the order of the A List -----
 shortList: [Annette, Able, Aaron]
 namesList: [David, Annette, Able, Aaron, Barry, Charles, Edward, David]

 ----- Add element to subList View -----
 shortList: [Annette, Able, Aaron, Aryn]
 namesList: [David, Annette, Able, Aaron, Aryn, Barry, Charles, Edward, David]

 -----This implements sort of subList, using method reference -----
 shortList: [Aaron, Able, Annette, Aryn]
 namesList: [David, Aaron, Able, Annette, Aryn, Barry, Charles, Edward, David]

 ----- Added Brad to namesList -----
 namesList = [David, Aaron, Able, Annette, Aryn, Barry, Brad, Charles, Edward, David]
 shortList no longer exist java.util.ConcurrentModificationException

 ---- copyOf() method copy ----
 copiedList: [David, Aaron, Able, Annette, Aryn, Barry, Brad, Charles, Edward, David]
 cannot add Ralph to copiedList java.lang.UnsupportedOperationException[David, Aaron, Able, Annette, Aryn, Barry, Brad, Charles, Edward, David, Ralph]
 cannot copy newList because has a null value java.lang.NullPointerException[David, Aaron, Able, null, Annette, Aryn, Barry, Brad, Charles, Edward, David, Ralph]
 newList copied correctly[[David, Aaron, Able, null, Annette, Aryn, Barry, Brad, Charles, Edward, David, Ralph]]
 newList[0] =[David, Aaron, Able, null, Annette, Aryn, Barry, Brad, Charles, Edward, David, Ralph]
 newList[0] =David

 Process finished with exit code 0

 */