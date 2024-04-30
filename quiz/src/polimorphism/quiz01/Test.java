package polimorphism.quiz01;

class Plant {}
class Flower extends Plant {}
public class Test {

    public static void main(String[] args ) {

        // Primitive Casting
        float f1 = (float) 10.0;  // Line 1
        float f2 = (float) 10.0f;  // Line 2

    //    float f3 = (float) f1/2.0;  // Line 3 this is an error, Cast is applied only at f1 not at the result
        float f4 = (float) f1/2.0f;  // Line 4
        double d1 = (double) 10.6f;

        // Object Casting
        Object o = new Plant();
        Plant plantA = new Flower();
        Plant plantB = (Plant) o;  // Line 5
        Plant plantC = (Flower) o;  // Line 6
        Flower flower = (Flower) o;  // Line 7
    }
}