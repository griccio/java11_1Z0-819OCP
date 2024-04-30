


class MyRunnableThread implements Runnable{

    int count;
    int sleepTime;

    public MyRunnableThread(int sleepTime){
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try{
            do{
                System.out.println(" : " + count++);
                Thread.sleep(sleepTime * 1000);
            }while(true);

        }catch(InterruptedException e){
            System.out.println(e.getMessage() + ", caused " + e.getCause());
        }

    }
}

public class MySampleRunnableThread {

    public static void main(String[] args) {

        Thread t1 = new  Thread(new MyRunnableThread(5));
        t1.start();
    }
}
