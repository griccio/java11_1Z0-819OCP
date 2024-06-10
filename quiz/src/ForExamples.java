public class ForExamples {

            public static void main(String[] args) {
                int ctr = 100;
                one:
                for (var i = 0; i < 10; i++) {
                    two:
                    for (var j = 0; j < 7; j++) {
                        three:
                        while (true) {
                            ctr++;
                            if (i > j) {
                                break one;
                            } else if (i == j) {
                                break two;
                            } else {
                                break three;
                            }
                        }
                    }
                }
                System.out.println(ctr);

                int i = 0;
                String res = null;
                for(String [] s = {"A", "B", "C", "D"};;res = String.join(".", s)) { //Line n1
                    if(i++ == 0)
                        continue;
                    else
                        break;
                }
                System.out.println(res); //Line n2

                for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
                    System.out.println(x + y + z);
                }

                boolean flag = false;
                do {
                    if(flag = !flag) { //Line n1
                        System.out.print(1); //Line n2
                        continue; //Line n3
                    }
                    System.out.print(2); //Line n4
                } while(flag); //Line n5


                for(int a=0;;a++)
                    System.out.println(a);


            }


        }

class A {
    A() {
        System.out.print(1);
    }
    class B {
        B() {
            System.out.print(2);
        }
    }
}
class P {
    private int var = 100;
    class Q {
        String var = "Java";
        void print() {
            System.out.println(var);
        }
    }
}

