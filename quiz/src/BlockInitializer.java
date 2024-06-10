
class MyBlock{
    public int i = 10;
    {
        System.out.println("i is" + this.i);
        int i = 20;
        System.out.println("inside Block");
    }

    MyBlock(int i){
        System.out.println("inside constructor");
        this.i = i;
    }
    {i--;
        System.out.println("inside second block");
    }
}
public class BlockInitializer {
    public static void main(String[] args) {
        MyBlock m = new MyBlock(2);
        System.out.println(m.i);
    }
}
