
class Outer{
    class Inner{}
}



public class SampleInnerMemberClass {


    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inn = outer.new Inner();

//        Inner inn2 = outer.new Inner();
        Outer.Inner inn3 = new Outer().new Inner();
        Outer.Inner inn4 = new Outer().new Inner();

    }
}
