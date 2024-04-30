import java.util.Objects;

class MySampleThread extends Thread{

    int count = 0;
    int sleepTime = 1;
    public MySampleThread(String name){
        this.setName(name);
    }

    public MySampleThread(String name, int sleepTime){
        this.setName(name);
        this.sleepTime = sleepTime;
    }

    public void run(){

        while(true) {
            try {
                System.out.println("Hello this is " + this.getName() + " count is " + count++);
                sleep(sleepTime * 1000);
            }catch(InterruptedException e ){
                System.out.println(e.getMessage() + " cause " + e.getCause());
            }
        }
    }

}

public class MySampleCreateThread {
    public static void main(String[] args) {

        Thread t1 = new MySampleThread("t1", 1);
        Thread t7 = new MySampleThread("t7", 7);

        t1.start();
        t7.start();
    }
}
