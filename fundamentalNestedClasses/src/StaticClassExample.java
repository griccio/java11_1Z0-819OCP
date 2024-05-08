import static nest.EnclosingClass.NestedStaticClass;

public class StaticClassExample {

    public static void main(String[] args) {
        // Reference static field on static nested class directly:
        System.out.println(NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
       NestedStaticClass.NestedInterface n;

       NestedStaticClass nestedStaticClass = new NestedStaticClass();
        System.out.println(nestedStaticClass.getInstanceName());

    }
}
