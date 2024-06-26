/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 11: Concurrency
Topic:  Using ExecutorService
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Class tests SingleThreadedExecutorService with two threads
public class ExecutorExample {

    // main method
    public static void main(String[] args) throws InterruptedException {

        // Get new service using Executors class, static factory method
        ExecutorService executorService
                = Executors.newSingleThreadExecutor();

        // Fire and Forget method of execution:  ThreadOne
        executorService.execute(ExecutorExample::doSomethingThreadOne);

        // Fire and Forget method of execution: ThreadTwo
        executorService.submit(ExecutorExample::doSomethingThreadTwo);

        for (int i = 1; i < 11; i++) {
            System.out.println("Main thread: iteration " + i);
            Thread.sleep(1000);
        }

        // Shutdown the service
        executorService.shutdown();
        executorService.awaitTermination(2, TimeUnit.MILLISECONDS);

        System.out.println("All done!!");
    }

    // Method will run asynchronously, printing numbers 1-5
    private static void doSomethingThreadOne() {
        for (int i = 1; i <= 5; i++) {

            System.out.println("--> First Thread: iteration " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException iex) {
                break;
            }
        }
    }

    // Method will run asynchronously, printing numbers 10-5
    private static void doSomethingThreadTwo() {
        for (int i = 10; i > 5; i--) {

            System.out.println("--> Second thread: iteration " + i);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException iex) {
                break;
            }
        }
    }
}