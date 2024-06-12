/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Identify the Scope of a variable
*/

public class TestPerson {
    public static void main(String[] args) {

        // First we'll create a person, JOE using 2 args constructor.
        Person joe = new Person("JOE", "55");

        // Next we'll create a person, using 2 arguments
        Person deb = new Person("DEB", "85");

        // And now the noargs constructor, and using setters
        Person ann = new Person();

        System.out.println(joe);
        System.out.println(deb);
        System.out.println("---- ANN BEFORE ----");
        System.out.println(ann);
        ann.setAge("21");
        ann.setInstanceName("ANN");

        System.out.println("---- ANN AFTER ----");
        System.out.println(ann);
    }
}

/*
JOE is 55 years old (PERSON.name=DEB Baby Boomer, Decade 5, Year 5 )
DEB is 85 years old (PERSON.name=DEB The Silent Generation, Decade 8, Year 5 )
---- ANN BEFORE ----
UNKNOWN is 25 years old (PERSON.name=DEB Voting Millenial, Decade 2, Year 5 )
---- ANN AFTER ----
ANN is 21 years old (PERSON.name=DEB Voting Millenial, Decade 2, Year 1 )
*/
