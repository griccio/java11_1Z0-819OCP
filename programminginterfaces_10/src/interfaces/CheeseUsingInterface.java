package interfaces;

interface Spreadable{
    void spread();

    default void spreadWithSpoon(){
        System.out.println("I'm so soft that you can take me with a spoon");
    }
    default void spreadWithKnife(){
        System.out.println("Traditionally you have to spread me with a rounded knife");
    }

}

abstract class Cheese{
    String name;
    String type;
}

class Pecorino extends Cheese {

}

class Stracchino extends Cheese implements Spreadable{

    @Override
    public void spread() {
        spreadWithKnife();
    }
}

public class CheeseUsingInterface {

    public static void main(String[] args ){
        Stracchino stracchino = new Stracchino();
        stracchino.spread();
    }
}


