
class MyGenericClass<T>{

    T value;
    MyGenericClass(T t){
        this.value = t;
    }
    public void printType(){
        System.out.println("Type is " + value.getClass().getName());
    }

}

class MyGenericNumberClass<T extends Number >{

    T value;
    MyGenericNumberClass(T t){
        this.value = t;
    }
    public void printType(){
        System.out.println("Type is " + value.getClass().getName());
    }

    public int add(T t1, T t2){
        return  (t1.intValue() + t2.intValue());
    }

}


public class GenericSamples {
    public static void main(String[] args) {
        MyGenericClass<Integer> myGenericInteger = new MyGenericClass<>(Integer.valueOf(100));
        myGenericInteger.printType();

        MyGenericClass<Integer> myGenericInteger2 = new MyGenericClass<>(100);
        myGenericInteger2.printType();

        MyGenericClass<Boolean> myGenericBoolean = new MyGenericClass<>(Boolean.valueOf(true));
        myGenericBoolean.printType();
        //I can use raw type(I removed <> diamond operator) but I could have a Runtime Exception
        MyGenericClass<String> myGenericString = new MyGenericClass(new StringBuilder("Hello"));
       String str = myGenericString.value;

    }
}
/*

    Type is java.lang.Integer
        Type is java.lang.Integer
        Type is java.lang.Boolean
        Exception in thread "main" java.lang.ClassCastException: class java.lang.StringBuilder
        cannot be cast to class java.lang.String (java.lang.StringBuilder
        and java.lang.String are in module java.base of loader 'bootstrap')
        at GenericSamples.main(GenericSamples.java:27)
*/
