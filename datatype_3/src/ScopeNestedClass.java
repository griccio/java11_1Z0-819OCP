public class ScopeNestedClass {
    int i =10;
    class LocalClass{
        int i=100;
        public  void printi(){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        ScopeNestedClass scopeNestedClass = new ScopeNestedClass();
        LocalClass local = scopeNestedClass.new LocalClass();
        local.printi();

    }
}
