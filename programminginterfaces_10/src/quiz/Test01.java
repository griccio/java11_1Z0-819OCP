package quiz;

public class Test01 {
    public interface Test {
        public static final int counter=0;

        private void doItPrivately() {
            System.out.println("A private method");
        }

        void doThat();

        default String doThat(String s) {
            return s;
        }
    }
}
