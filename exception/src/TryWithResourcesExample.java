class MyDoor implements AutoCloseable{

    MyDoor(){
        System.out.println("The door is open");
    }
    @Override
    public void close() throws Exception {
        System.out.println("The Door is closed now");
    }
}
public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(MyDoor door = new MyDoor()){
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
