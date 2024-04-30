import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

public class MySynchronizedMethod {

    static Integer count  = Integer.valueOf(0);

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable t2sec =  () -> increaseCount("t2sec",2);
        Runnable t3sec =  () -> increaseCount("t3sec.",1);

        executorService.execute(t2sec);
        executorService.execute(t3sec);

        executorService.shutdown();
    }

    public  static void increaseCount(String threadName, int timeSleepInSeconds ){
       try{
           for(var e=0; e <5; e++){
               System.out.printf("\n[%s into the queue] count = %d\n", threadName, count);
               synchronized(count) {
                   System.out.printf("\n[%s Starting] count = %d\n", threadName, count);
                   int i = count;
                   count++;
                   System.out.printf("\n[%s] count = %d  count++ = %d\n", threadName, i, count);
                   Thread.sleep(timeSleepInSeconds * 1000);
               }
           }

       }catch (InterruptedException e){
           e.printStackTrace();
       }

    }

}
