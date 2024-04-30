import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.*;

public class MyInvokeAllExample {

    public static void main(String[] args) {

        //create the collection of task
        Collection<Callable<String>> tasks = List.of(
                () -> MyInvokeAllExample.printDiceValue(1),
                () -> MyInvokeAllExample.printDiceValue(2),
                () -> MyInvokeAllExample.printDiceValue(3),
                () -> MyInvokeAllExample.printDiceValue(4),
                () -> MyInvokeAllExample.printDiceValue(5),
                () -> MyInvokeAllExample.printDiceValue(6)
        );

        ExecutorService executorService = null;
        List<Future<String>> results = null;

        try {

            //create the executorService
            executorService = Executors.newSingleThreadExecutor();

            results = executorService.invokeAll(tasks, 30, TimeUnit.SECONDS);


//            executorService.shutdown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
                try {
                    // Wait no longer than 2 seconds for completion confirmation
//                    executorService.awaitTermination(2, TimeUnit.SECONDS);

                    if (results != null) {
                        // Print out results of each task
                        for (Future<String> f : results) {
                            System.out.println(f);
                            System.out.println(f.get());
                        }
                    }

                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static String printDiceValue(int i){
        try{
            int time = getRandomNumberUsingNextInt(1000,5000);
            Thread.sleep(time);
            return "["+ time/1000 + " sec.]" + " VALUE IS " + i;
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return "0";
    }


    private static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
