package mysample.pkgb;

import mysample.pkga.A1;

public class B1 extends A1 {
    int myInt = 1;
    B1(){
        myInt = this.protectedInt;
        myInt = this.publicInt;
        myInt = publicInt;
        myInt = super.publicInt;
    }
    public void print(){
        A1 a = new A1();
        System.out.println(a.publicInt);
//        System.out.println(a.protectedInt);//error
        System.out.println(protectedInt);
        System.out.println(this.protectedInt);
        System.out.println(super.protectedInt);
    }
}
