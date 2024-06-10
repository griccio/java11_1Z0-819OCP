package myexample;
interface drawable{
    public default void drawLine() {
        System.out.println("Draw A line");
    }
    default void drawCircle(){
        System.out.println("draw A Circle");
    }
}

public class VerySampleInterface {
}
