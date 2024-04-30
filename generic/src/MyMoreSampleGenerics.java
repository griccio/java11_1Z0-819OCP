
class MyBounded<T extends Number>{
    T myObj;
    MyBounded(T t){
        myObj=t;
    }

/*

    public <T> T add(T t1, T t2){
        return t1 + t2;
    }
*/

}
class MySampleGeneric<T,S>{
    //two istance fields
    T first;
    S second;

    MySampleGeneric(T first, S second){
        this.first = first;
        this.second = second;
    }
}

public class MyMoreSampleGenerics {
    public static void main(String[] args) {
        MySampleGeneric<String,String> a = new MySampleGeneric<>("Hello" , "World");
        System.out.println("MySampleGeneric<String,String>" + a.first + " " + a.second);
        MySampleGeneric<String,Integer> b = new MySampleGeneric<>("Hello" , 2024);
        System.out.println("MySampleGeneric<String,Integer> " + b.first + " " + b.second);
        MyBounded<Short> s1 = new MyBounded<Short>(Short.valueOf("10"));
//        MyBounded<String> s2 = new MyBounded<String>("Hello"); //this is a compile error

    }
}

