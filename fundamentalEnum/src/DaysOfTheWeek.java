
/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals
Topic : Enum Type
*/

// Declaring an enum type with 7 constants
public enum DaysOfTheWeek {
    // Note that it is not required to make all constants uppercase,
    // but is considered best practice
    sunday, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class TestDaysOfTheWeek {
    public static void main(String[] args) {

        // Retrieve the list of enum constants from
        // DaysOfTheWeek.values() static method
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day.ordinal() + " is " + day);
        }

        // Example of using the valueOf() static method
        System.out.println(DaysOfTheWeek.valueOf("WEDNESDAY"));

// We can loop through the list of values..
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day.ordinal() + " is " + day);
            switch (day) {
                case MONDAY:
                case TUESDAY:
                    System.out.println("Long road ahead");
                    break;
                case WEDNESDAY:
                    System.out.println("Hump day");
                    break;
                case THURSDAY:
                    System.out.println("TGIF - 1");
                    break;
                case FRIDAY:
                    System.out.println("TGIF");
                    break;
                case SATURDAY:
                case sunday:
                    System.out.println("Wonderful Weekend");
            }
        }
    }
}
/**
 Compiled from "DaysOfTheWeek.java"
 public final class DaysOfTheWeek extends java.lang.Enum<DaysOfTheWeek> {
 public static final DaysOfTheWeek sunday;
 public static final DaysOfTheWeek MONDAY;
 public static final DaysOfTheWeek TUESDAY;
 public static final DaysOfTheWeek WEDNESDAY;
 public static final DaysOfTheWeek THURSDAY;
 public static final DaysOfTheWeek FRIDAY;
 public static final DaysOfTheWeek SATURDAY;
 public static DaysOfTheWeek[] values();
 public static DaysOfTheWeek valueOf(java.lang.String);
 static {};
 }
 */