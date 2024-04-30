import java.util.*;

public class MySampleQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(List.of(10, 20, 50, 40, 30));
        Queue<Integer> ql = new LinkedList<>();
        q.add(1);
        try {
            q.add(null);
        } catch (Exception e) {
            System.out.println("q.add(null)");
            e.printStackTrace();
        }
        q.offer(2);
        q.add(3);
        try {
            q.offer(null);
        } catch (Exception e) {
            System.out.println("q.offer(null)");
            e.printStackTrace();
        }
        q.offer(50);
        System.out.println("queue  q = " + q);
        System.out.println("q.element() = " + q.element());
        try {
            System.out.println("ql.element() = " + ql.element());
        } catch (Exception e) {
            System.out.println("ql.element() = " + e);
        }

        System.out.println("q.element() = " + q.peek());
        System.out.println("ql.element() = " + ql.peek());

        System.out.println("q.poll() = " + q.poll());
        System.out.println("queue  q = " + q);
        System.out.println("ql.poll() = " + ql.poll());

    }
}
/**

 q.add(null)
 java.lang.NullPointerException
 at java.base/java.util.ArrayDeque.addLast(ArrayDeque.java:304)
 at java.base/java.util.ArrayDeque.add(ArrayDeque.java:495)
 at MySampleQueue.main(MySampleQueue.java:9)
 q.offer(null)
 java.lang.NullPointerException
 at java.base/java.util.ArrayDeque.addLast(ArrayDeque.java:304)
 at java.base/java.util.ArrayDeque.offerLast(ArrayDeque.java:353)
 at java.base/java.util.ArrayDeque.offer(ArrayDeque.java:509)
 at MySampleQueue.main(MySampleQueue.java:17)
 queue  q = [10, 20, 50, 40, 30, 1, 2, 3, 50]
 q.element() = 10
 ql.element() = java.util.NoSuchElementException
 q.element() = 10
 ql.element() = null
 q.poll() = 10
 queue  q = [20, 50, 40, 30, 1, 2, 3, 50]
 ql.poll() = null
 */