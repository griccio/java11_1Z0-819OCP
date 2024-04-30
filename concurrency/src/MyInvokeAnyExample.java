import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class MyInvokeAnyExample {

    public static void main(String[] args) {

        //create the collection of task
        Collection<Callable<String>> tasks = List.of(
                () -> MyInvokeAnyExample.printDiceValue(1),
                () -> MyInvokeAnyExample.printDiceValue(2),
                () -> MyInvokeAnyExample.printDiceValue(3),
                () -> MyInvokeAnyExample.printDiceValue(4),
                () -> MyInvokeAnyExample.printDiceValue(5),
                () -> MyInvokeAnyExample.printDiceValue(6)
        );

        ExecutorService poolService= null;

        try {
            poolService = Executors.newCachedThreadPool();

            String  result = poolService.invokeAny(tasks, 20, TimeUnit.SECONDS);
            System.out.println("------ Result from InvokeAny------ ");
            if (result != null) {
                System.out.println(result);
            }
            System.out.println("---------------------------------- ");

        } catch (InterruptedException | ExecutionException | TimeoutException e) {
          //  e.printStackTrace();
        } finally {
            if (poolService != null) {
                poolService.shutdown();
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
