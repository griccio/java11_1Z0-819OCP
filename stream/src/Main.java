import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> output = input;
        for (int i = 0; i < input.size(); i++) {
            output.set(i, input.get(i) * 2);
        }
        System.out.println("lista originaria = {}"+ input);
        System.out.println("lista finale = {}"+ output);

    }
}