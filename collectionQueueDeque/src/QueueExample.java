/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 4: Generics and Collections
Topic:  Collections, Queue: ArrayDeque, LinkedList
*/

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        List<Integer> initialData = List.of(10, 20, 50, 40, 30);

        System.out.println("\n----------- ArrayDeque -----------");
        System.out.println("Original values entered: " + initialData);

        Queue<Integer> arrayQueue = new ArrayDeque<>(initialData);
        doStuffWithCollection(arrayQueue, 60, 50, 10);



        System.out.println("\n----------- LinkedList -----------");
        System.out.println("Original values entered: " + initialData);

        Queue<Integer> linkedList = new LinkedList<>(initialData);
        doStuffWithCollection(linkedList, 60, 50, 10);

        System.out.println("\n----------- ArrayDeque -----------");
        System.out.println("Test Basic Deque methods: " + arrayQueue);
        testBasicQueueMethods(arrayQueue);

        System.out.println("\n----------- ArrayDeque -----------");
        System.out.println("Additional Methods, initialData : "
                + arrayQueue);
        testBasicQueueMethods(arrayQueue);

        System.out.println("\n----------- LinkedList -----------");
        System.out.println("Additional Methods, initialData : "
                + linkedList);
        testBasicQueueMethods(linkedList);


        System.out.println("\n----------- ArrayDeque -----------");
        System.out.println("Deque Methods, initialData : "
                + arrayQueue);

        testDequeMethods((ArrayDeque<Integer>) arrayQueue);

        System.out.println("\n----------- LinkedList -----------");
        System.out.println("Deque Methods, initialData : "
                + linkedList);

        testDequeMethods((LinkedList<Integer>) linkedList);


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
        performBulkFunctions((Collection<Integer>) h);
    }

    // Bulk functions with Integers
    private static void performBulkFunctions(Collection<Integer> h) {
        // Perform some bulk functions...
        System.out.println("After addSeveral:" +
                h.addAll(List.of(5, 10, 15, 25, 25)) + " : " + h);
        System.out.println("containAll(10, 20, 90, 100) : " +
                h.containsAll(List.of(10, 20, 90, 100)) + " : " + h);
        System.out.println("containAll(5, 10, 15, 20, 25) : " +
                h.containsAll(List.of(5, 10, 15, 20, 25)) + " : " + h);
        System.out.println("After removeSeveral:" +
                h.removeAll(List.of(20, 30)) + " : " + h);
        System.out.println("After retainAll:" +
                h.retainAll(List.of(10, 20, 30, 40, 50, 90)) + " : " + h);

    }

    public static void testBasicQueueMethods(Queue<Integer> q) {

        //  Add elements using both add and offer
        System.out.println("After add(100) : " +
                q.add(100) + " : " + q);

        System.out.println("After offer(101) : " +
                q.offer(101) + " : " + q);

        try {

            System.out.println("After offer(null) : " +
                    q.offer(null) + " : " + q);
        } catch (Exception e) {
            System.out.println("After offer(null) : " );
            e.printStackTrace(System.out);
        }

        // Retrieve an element using element or peek
        System.out.println("element() returns : " +
                q.element() + " : " + q);

        System.out.println("peek() returns : " +
                q.peek() + " : " + q);

        // Retrieve and remove an element from the queue
        // using poll and remove
        System.out.println("poll() returns : " +
                q.poll() + " : " + q);

        System.out.println("remove() returns : " +
                q.remove() + " : " + q);
    }


    // The following methods work both with Deque and LinkedList
    public static void testDequeMethods(Deque q) {

        // Dequeue has a push method that adds element to the head
        // of the queue (opposite of add and offer)
        q.push(199);
        System.out.println("After push(199) : " + q);

        // Dequeue has a pop method that retrieves element at
        // the head of the queue (opposite of remove/poll
        System.out.println("pop() returns : " +
                q.pop() + " : " + q);

        // Adding Methods, addFirst, offerFirst, addLast, offerLast
        q.addFirst(200);
        System.out.println("After addFirst(200) : " + q);

        System.out.println("After offerFirst(201) : " +
                q.offerFirst(201) + " : " + q);

        q.addLast(300);
        System.out.println("After addLast(300) : " + q);

        System.out.println("After offerLast(301) : " +
                q.offerLast(301) + " : " + q);

        // Retrieval Methods, getFirst, getLast, peekFirst, peekLast
        System.out.println("getFirst() returns : " +
                q.getFirst() + " : " + q);

        System.out.println("getLast() returns : " +
                q.getLast() + " : " + q);

        System.out.println("peekFirst() returns : " +
                q.peekFirst() + " : " + q);

        System.out.println("peekLast() returns : " +
                q.peekLast() + " : " + q);

        // Removal methods, pollFirst, pollLast, removeFirst, removeLast
        System.out.println("pollFirst() returns : " +
                q.pollFirst() + " : " + q);

        System.out.println("pollLast() returns : " +
                q.pollLast() + " : " + q);

        System.out.println("removeFirst() returns : " +
                q.removeFirst() + " : " + q);
        System.out.println("removeLast() returns : " +
                q.removeLast() + " : " + q);
    }

}
/**

 ----------- ArrayDeque -----------
 Original values entered: [10, 20, 50, 40, 30]
 Start of method: [10, 20, 50, 40, 30]
 Exception adding null: java.lang.NullPointerException
 After adding 60 true : [10, 20, 50, 40, 30, 60]
 After adding 50 true : [10, 20, 50, 40, 30, 60, 50]
 After removing  10 true : [20, 50, 40, 30, 60, 50]
 After removing null false : [20, 50, 40, 30, 60, 50]
 After addSeveral:true : [20, 50, 40, 30, 60, 50, 5, 10, 15, 25, 25]
 containAll(10, 20, 90, 100) : false : [20, 50, 40, 30, 60, 50, 5, 10, 15, 25, 25]
 containAll(5, 10, 15, 20, 25) : true : [20, 50, 40, 30, 60, 50, 5, 10, 15, 25, 25]
 After removeSeveral:true : [50, 40, 60, 50, 5, 10, 15, 25, 25]
 After retainAll:true : [50, 40, 50, 10]

 ----------- LinkedList -----------
 Original values entered: [10, 20, 50, 40, 30]
 Start of method: [10, 20, 50, 40, 30]
 After adding null true : [10, 20, 50, 40, 30, null]
 After adding 60 true : [10, 20, 50, 40, 30, null, 60]
 After adding 50 true : [10, 20, 50, 40, 30, null, 60, 50]
 After removing  10 true : [20, 50, 40, 30, null, 60, 50]
 After removing null true : [20, 50, 40, 30, 60, 50]
 After addSeveral:true : [20, 50, 40, 30, 60, 50, 5, 10, 15, 25, 25]
 containAll(10, 20, 90, 100) : false : [20, 50, 40, 30, 60, 50, 5, 10, 15, 25, 25]
 containAll(5, 10, 15, 20, 25) : true : [20, 50, 40, 30, 60, 50, 5, 10, 15, 25, 25]
 After removeSeveral:true : [50, 40, 60, 50, 5, 10, 15, 25, 25]
 After retainAll:true : [50, 40, 50, 10]

 ----------- ArrayDeque -----------
 Test Basic Deque methods: [50, 40, 50, 10]
 After add(100) : true : [50, 40, 50, 10, 100]
 After offer(101) : true : [50, 40, 50, 10, 100, 101]
 After offer(null) :
 java.lang.NullPointerException
 at java.base/java.util.ArrayDeque.addLast(ArrayDeque.java:304)
 at java.base/java.util.ArrayDeque.offerLast(ArrayDeque.java:353)
 at java.base/java.util.ArrayDeque.offer(ArrayDeque.java:509)
 at QueueExample.testBasicQueueMethods(QueueExample.java:124)
 at QueueExample.main(QueueExample.java:31)
 element() returns : 50 : [50, 40, 50, 10, 100, 101]
 peek() returns : 50 : [50, 40, 50, 10, 100, 101]
 poll() returns : 50 : [40, 50, 10, 100, 101]
 remove() returns : 40 : [50, 10, 100, 101]

 ----------- ArrayDeque -----------
 Additional Methods, initialData : [50, 10, 100, 101]
 After add(100) : true : [50, 10, 100, 101, 100]
 After offer(101) : true : [50, 10, 100, 101, 100, 101]
 After offer(null) :
 java.lang.NullPointerException
 at java.base/java.util.ArrayDeque.addLast(ArrayDeque.java:304)
 at java.base/java.util.ArrayDeque.offerLast(ArrayDeque.java:353)
 at java.base/java.util.ArrayDeque.offer(ArrayDeque.java:509)
 at QueueExample.testBasicQueueMethods(QueueExample.java:124)
 at QueueExample.main(QueueExample.java:36)
 element() returns : 50 : [50, 10, 100, 101, 100, 101]
 peek() returns : 50 : [50, 10, 100, 101, 100, 101]
 poll() returns : 50 : [10, 100, 101, 100, 101]
 remove() returns : 10 : [100, 101, 100, 101]

 ----------- LinkedList -----------
 Additional Methods, initialData : [50, 40, 50, 10]
 After add(100) : true : [50, 40, 50, 10, 100]
 After offer(101) : true : [50, 40, 50, 10, 100, 101]
 After offer(null) : true : [50, 40, 50, 10, 100, 101, null]
 element() returns : 50 : [50, 40, 50, 10, 100, 101, null]
 peek() returns : 50 : [50, 40, 50, 10, 100, 101, null]
 poll() returns : 50 : [40, 50, 10, 100, 101, null]
 remove() returns : 40 : [50, 10, 100, 101, null]

 ----------- ArrayDeque -----------
 Deque Methods, initialData : [100, 101, 100, 101]
 After push(199) : [199, 100, 101, 100, 101]
 pop() returns : 199 : [100, 101, 100, 101]
 After addFirst(200) : [200, 100, 101, 100, 101]
 After offerFirst(201) : true : [201, 200, 100, 101, 100, 101]
 After addLast(300) : [201, 200, 100, 101, 100, 101, 300]
 After offerLast(301) : true : [201, 200, 100, 101, 100, 101, 300, 301]
 getFirst() returns : 201 : [201, 200, 100, 101, 100, 101, 300, 301]
 getLast() returns : 301 : [201, 200, 100, 101, 100, 101, 300, 301]
 peekFirst() returns : 201 : [201, 200, 100, 101, 100, 101, 300, 301]
 peekLast() returns : 301 : [201, 200, 100, 101, 100, 101, 300, 301]
 pollFirst() returns : 201 : [200, 100, 101, 100, 101, 300, 301]
 pollLast() returns : 301 : [200, 100, 101, 100, 101, 300]
 removeFirst() returns : 200 : [100, 101, 100, 101, 300]
 removeLast() returns : 300 : [100, 101, 100, 101]

 ----------- LinkedList -----------
 Deque Methods, initialData : [50, 10, 100, 101, null]
 After push(199) : [199, 50, 10, 100, 101, null]
 pop() returns : 199 : [50, 10, 100, 101, null]
 After addFirst(200) : [200, 50, 10, 100, 101, null]
 After offerFirst(201) : true : [201, 200, 50, 10, 100, 101, null]
 After addLast(300) : [201, 200, 50, 10, 100, 101, null, 300]
 After offerLast(301) : true : [201, 200, 50, 10, 100, 101, null, 300, 301]
 getFirst() returns : 201 : [201, 200, 50, 10, 100, 101, null, 300, 301]
 getLast() returns : 301 : [201, 200, 50, 10, 100, 101, null, 300, 301]
 peekFirst() returns : 201 : [201, 200, 50, 10, 100, 101, null, 300, 301]
 peekLast() returns : 301 : [201, 200, 50, 10, 100, 101, null, 300, 301]
 pollFirst() returns : 201 : [200, 50, 10, 100, 101, null, 300, 301]
 pollLast() returns : 301 : [200, 50, 10, 100, 101, null, 300]
 removeFirst() returns : 200 : [50, 10, 100, 101, null, 300]
 removeLast() returns : 300 : [50, 10, 100, 101, null]

 */