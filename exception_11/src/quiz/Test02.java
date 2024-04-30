package quiz;

public class Test02 {

        public static void main(String[] args) {
//            int i; this is the error
            int i=0; //this is the solution
            try {
                i = 0;
                System.out.println("i =" + 10 / i++);
            } catch (RuntimeException e) {

            } finally {
                System.out.println("i = " + i);
            }
        }
    }

