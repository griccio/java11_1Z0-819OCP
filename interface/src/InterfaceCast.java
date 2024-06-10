/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Create and implement interfaces
*/

// Very simple interface with one method
interface Laughable {
    void laugh();
}

// A class that implements the interface
class Joke implements Laughable {
    public void laugh() {
        System.out.println("That joke is laughable");
    }
}

// A class that does not implement the interface
class Story {
    public void read() {
        System.out.println("This story is a good read");
    }
}

// A class that extends Story class above and implements
// interface
class FunnyStory extends Story implements Laughable {

    // implements laugh() method from Laughable
    public void laugh() {
        System.out.println("That story is funny");
    }

    // overrides read() method from Story
    public void read() {
        System.out.println("This story is a good giggle");
    }
}

// The main class
public class InterfaceCast {
    public static void main(String[] args) {
        Story story = new Story();
        FunnyStory funnyStory = new FunnyStory();
        Joke joke = new Joke();

        // call pass through method on different types
        // of objects
        testLaughable(joke);
        testLaughable(funnyStory);

        // call pass through method on different types
        // of objects
        testStory(story);
        testStory(funnyStory);
        // Cast objects and pass to our methods
        testLaughable((Laughable) story);
        //this is a compile error
//        testStory((Story) joke);
    }

    // Pass through method to execute laugh method on any
    // object that implements Laughable
    public static void testLaughable(Laughable l) {
        l.laugh();
    }

    // Pass through method to execute read method on any
    // object 'Is A' Story
    public static void testStory(Story s) {
        s.read();
    }
}