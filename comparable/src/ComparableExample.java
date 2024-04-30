import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SmartDog implements Comparable<SmartDog>{
    private DogType dogType;
    public SmartDog(DogType t){
        dogType = t;
    }
    public int compareTo(SmartDog smartDog){
        System.out.println("comparing " + this + " with argument " + smartDog +
                " = " + (this.dogType.smartLevel - smartDog.dogType.smartLevel));
        return this.dogType.smartLevel - smartDog.dogType.smartLevel;
    }

    @Override
    public String toString() {
        return "SmartDog{" +
                "dogType=" + dogType +
                '}';
    }

    public enum DogType{
        POODLE(1),
        LABRADOODLE(2),
        COLLIE(3),
        LABRADOR(4),
        PUG(5);

        int smartLevel =6;
        DogType(int smartLevel){
            this.smartLevel = smartLevel;
        }

    }
}


public class ComparableExample {

    public static void main(String[] args) {
        System.out.println("-----TreeSet start constructing -------");
        Set<SmartDog> dogSet = new TreeSet<>(
                Set.of(
                        new SmartDog(SmartDog.DogType.COLLIE),
                        new SmartDog(SmartDog.DogType.LABRADOODLE),
                        new SmartDog(SmartDog.DogType.PUG),
                        new SmartDog(SmartDog.DogType.POODLE),
                        new SmartDog(SmartDog.DogType.LABRADOR))
        );

        System.out.println("-----TreeSet constructed-------");
        System.out.println("Sorted Dogs " + dogSet);
    }

}
