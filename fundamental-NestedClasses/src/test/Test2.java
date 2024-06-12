package test;

class M {
    private int num1 = 100;

    class N {
        private int num2 = 200;
    }
    public void sum(){
        M outer = new M();
        M.N inner = outer.new N();
        System.out.println(outer.num1 + inner.num2);
    }
}

public class Test2 {
    public static void main(String[] args) {
        M outer = new M();
        M.N inner = outer.new N();
//        System.out.println(outer.num1 + inner.num2);
    }
}

