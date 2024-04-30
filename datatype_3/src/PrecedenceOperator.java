public class PrecedenceOperator {

    public static void main(String[] args) {
        int i=0;
        int j=0;

        System.out.println("Evaluate i1++ = " + i++);
        System.out.println("Evaluate i1 = " + i);

        System.out.println("Evaluate ++i1 = " + ++i);
        System.out.println("Evaluate i1 = " + i);

        System.out.println("Evaluate ++i1 = " + +i);
        System.out.println("Evaluate i1 = " + i);

        i=0;
        j=0;
        j = i++;
        System.out.format("Evaluate after j = i++ -> i=%d j=%d (expected values are i=1 j=0;)\n",i,j);
        i=10;
        j=0;
        j = +-i;
        System.out.format("Evaluate after j = ++i -> i=%d j=%d (expected values are i=1 j=0;)\n",i,j);

        i=0;
        j=0;
        System.out.println(""+ (i)++);

    }
}
