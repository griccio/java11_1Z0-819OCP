/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
*/

// Teachable interface with abstract method teach
// and default method teachTheseLessons
interface Teachable {

    // default method
    default void teachTheseLessons() {
        System.out.println("Teachable: Everyone should learn art and music");
    }

    void teach();
}

// Trainable interface with abstract method train
// and default method teachTheseLessons
interface Trainable {

    // default method
    default void teachTheseLessons() {
        System.out.println("Trainable: Train them to do this");
    }

    void train();
}

// Our class implements one of these interfaces for now
public class TestDefaultMethods implements Teachable,Trainable {

    // main method calls teach and train() methods
    public static void main(String[] args) {
        TestDefaultMethods t = new TestDefaultMethods();
        t.teach();
        t.train();
    }

    // we implement teach and call the default method
    public void teach() {
        teachTheseLessons();
        Teachable.super.teachTheseLessons();
        Trainable.super.teachTheseLessons();
    }


    // we implement train for later use
    public void train() {
        System.out.println("TestDefaultMethod: Everyone can be trained to get up early");
    }

    public void teachTheseLessons() {
        System.out.println("TestDefaultMethod: Train them to do this");
    }

}