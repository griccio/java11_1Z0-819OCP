public class SampleTest {

    public static void main(String[] args) {
        byte var = 127;
        System.out.println(var++);
        System.out.println(var*=2);
        System.out.println(--var);
        System.out.println(var*=100);
        System.out.println(var + 1);
//
//        boolean status = true;
//        System.out.println(status = false || status = true | status = false);
//        System.out.println(status);


        //precedence
        System.out.println("//precedence");
        var count = 10;

        System.out.println(++count + count--);

        System.out.println(--count * count++ + count-- - --count);

        count =10;
        System.out.println(count+=10 + count--);



        count =10;
        System.out.println(count+=10);
        System.out.println(count);



    }
}
