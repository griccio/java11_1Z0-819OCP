import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.concurrent.*;


class MySubmitExecutorClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello");
    }
}


public class MyExecutorExample {

    public static void main(String[] args) throws InterruptedException{

        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.execute(MyExecutorExample::method1);
            executorService.execute(new MySubmitExecutorClass());
//
//            executorService.execute(() -> {
//                for (int i=0; i<10; i++)
//                    System.out.println("Hello " + i);
//            });

            //some main thread operations
            for(int i=0;i<10;i++){
                System.out.println(" Main Thread iteration: " + i);
                Thread.sleep(1000);
            }
            System.out.println("All done!!");
            // Shutdown the service
            executorService.shutdown();
            executorService.awaitTermination(2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void method1(){
        int counter = 1000;
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
                System.out.println("method 1 + " + counter++);
            }catch(InterruptedException e){
                System.out.println(e.getMessage() + " cause " + e.getCause());
            }
        }
    }
    public static int method2(){
        int counter = 2000;
        int tot = 0;
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(2000);
                System.out.println("method 2 + " + counter++);
                tot += counter;
            }catch(InterruptedException e){
                System.out.println(e.getMessage() + " cause " + e.getCause());
            }
        }
        return tot;
    }

    public static int method3(){
        int counter = 3000;
        int tot = 0;
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(2000);
                System.out.println("method 3 + " + counter++);
                tot += counter;
            }catch(InterruptedException e){
                System.out.println(e.getMessage() + " cause " + e.getCause());
            }
        }
        return tot;
    }

}
