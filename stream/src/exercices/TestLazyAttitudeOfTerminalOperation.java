package exercices;

import java.util.Random;
import java.util.stream.Stream;

class Student{
    public String name;
    Student(String name){
        System.out.println("Instantiating a new Student : " + name);
        this.name = name;
    }

    Student(){
        this.name = "Unknow";
        System.out.println("Instantiating a new Student : " + name);
    }
}

public class TestLazyAttitudeOfTerminalOperation {
    private static Student getNewStudent() {
        String[] names = {"Mary", "Jim", "Joe", "Aaron"};
        int i = new Random().nextInt(4);
        return new Student(names[i]);
    }
    public static void main(String[] args) {

        // not lazy constructor
        System.out.println("-------- stream1");
        Stream<Student> studentStream1 = Stream.of(new Student("Giuseppe"), new Student("Maria"), new Student("Giovanna"));
        System.out.println("-------- stream2");
        Stream.Builder<Student> streamBuilder  = Stream.builder();
        streamBuilder.add(new Student("giuseppe"));
        streamBuilder.add(new Student("maria"));
        streamBuilder.add(new Student("giovanna"));
        Stream<Student> studentStream2 = streamBuilder.build();

        //lazy contructor
        Stream<Student> studentStream3 = Stream.generate(() -> getNewStudent());
        Stream<Student> studentStream4 = Stream.generate(Student::new);

        //main method do some stuff
        for(int i = 0 ; i<100; i++) {
            System.out.print(i+ " ");
        }
        studentStream3 = studentStream3.limit(3);
        studentStream4 = studentStream4.limit(3);
        System.out.println("-------- stream3");
        studentStream3.forEach(s ->System.out.println(s.name));
        System.out.println("-------- stream4");
        studentStream4.forEach(s ->System.out.println(s.name));

    }
}
/**
 -------- stream1
 Instantiating a new Student : Giuseppe
 Instantiating a new Student : Maria
 Instantiating a new Student : Giovanna
 -------- stream2
 Instantiating a new Student : giuseppe
 Instantiating a new Student : maria
 Instantiating a new Student : giovanna
 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 ..
 -------- stream3
 Instantiating a new Student : Mary
 Mary
 Instantiating a new Student : Mary
 Mary
 Instantiating a new Student : Jim
 Jim
 -------- stream4
 Instantiating a new Student : Unknow
 Unknow
 Instantiating a new Student : Unknow
 Unknow
 Instantiating a new Student : Unknow
 Unknow

 */