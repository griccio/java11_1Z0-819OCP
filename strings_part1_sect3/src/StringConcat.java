import javax.sound.midi.Soundbank;

class MyObjec{
    @Override
    public String toString() {
        return "this in my object";
    }
}

class MyObjecWhitoutToString{

}
public class StringConcat {
    public static void main(String[] args) {
        Object nullObject = null;
        String helloString = "hello";
        String worldString = "world";
        // secondString will be “null hello"
        String secondString = nullObject + " " + helloString;
        System.out.println("secondString = " + secondString);//print secondString = null hello

        System.out.println(helloString += nullObject);// print hellonull
        System.out.println(nullObject += helloString);//print nullhellonull
        System.out.println(helloString);//print hellonull
        System.out.println(helloString += new MyObjec()); //print hellonull +  MyObject.toString
        System.out.println(helloString += new MyObjecWhitoutToString()); //print hellonull + @ the address

        String str = "Hello";
        str +=10;
        System.out.println(str);//print Hello10

        str+=null;
        System.out.println(str);//print Hello10null

        MyObjec myObjec = null;
        str+=myObjec;
        System.out.println("String + null Object: " + str);// print String + null Object: Hello10nullnull


    }
}
