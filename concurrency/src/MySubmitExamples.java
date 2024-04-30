
import java.util.concurrent.*;
class MySubmitClass implements Runnable{
    @Override
    public void run() {
    }
    public static String sayHello(){
        return "Hello again";
    }
}
public class MySubmitExamples {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();

            // Submits Runnable and returns void
           var submittedThread1  = executorService.submit(() -> {return "Hello";});

            Future<String> submittedThread2  = executorService.submit(MySubmitClass::sayHello);

            // Allow thread to complete before proceeding using while loop
            //  and checking Future.isDone() method.  Polling.
            while (!submittedThread1.isDone()) {
                Thread.sleep(250);
            }
            // Future.get() returns a null with single argument and
            // Runnable is first argument
            System.out.println("submittedThread1 = " + submittedThread1);
            System.out.println("submittedThread1.get() = " + submittedThread1.get());

            // Future.get() returns a null with single argument and
            // Runnable is first argument
            System.out.println("submittedThread1 = " + submittedThread2);
            System.out.println("submittedThread1.get() = " + submittedThread2.get());

            executorService.shutdown();
            executorService.awaitTermination(2, TimeUnit.SECONDS);

        } catch ( InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) executorService.shutdown();
        }

    }
}