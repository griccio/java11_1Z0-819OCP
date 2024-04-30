
interface Eval<T>{
   boolean isNegative(T t);
}

public class MySamplePredicate {
    public static void main(String[] args) {
        //before java 8 with anonymous class
        Eval<Integer> e = new Eval<>(){
            @Override
            public boolean isNegative(Integer i){
                return i<0;
            }
        };
        System.out.println(e.isNegative(10));

        //with lambda
        Eval<Integer> el = i -> i<10;
        System.out.println(el.isNegative(10));

    }



}
