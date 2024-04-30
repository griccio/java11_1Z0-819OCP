import java.io.*;
import java.sql.SQLOutput;

class MyAnimal {
    int age;
    int weight;

    MyAnimal(){
        System.out.println("Inside no args constructor");
    }
    MyAnimal(int age, int weight){
        this.age = age;
        this.weight = weight;
        System.out.println("Inside two args constructor");
    }
}
class MyPet extends MyAnimal  implements Serializable{
    private String name;
    private String type;
    private transient String breed;

    public static int count;

    MyPet(){
        super(0,0);
        System.out.println("inside the no args constructor");
    }

    MyPet(String name, String type) {
        super(0,0);
        this.name = name;
        this.type = type;
        System.out.println("inside the two args constructor");
    }

    @Override
    public String toString() {
        return "MyPet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age + '\'' +
                ", weight=" + weight + '\'' +
                ", count=" + count + '\'' +
                "} ";
    }
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.defaultWriteObject();
        out.writeInt(this.age);
        out.writeInt(this.weight);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        this.age = in.readInt();
        this.weight = in.readInt();
    }

}

public class MySerialisationExample_01 {

    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException {
        MyPet serializedPet = new MyPet("Lola", "Labrador");
        serializedPet.age = 3;
        serializedPet.weight = 43;
        MyPet.count =99;
        System.out.println("serializedPet" + serializedPet);
        String fileName = "lola.ser";

        // serialize my class
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            try {
                objectOutputStream.writeObject(serializedPet);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //deserialize object
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            MyPet petDeserialized = null;
            {
                petDeserialized = (MyPet) objectInputStream.readObject();
                System.out.println("deserializedPet = " + petDeserialized);
            }
        }
    }
}
/* OUTPUT age and weight are updated
Inside two args constructor
inside the two args constructor
serializedPetMyPet{name='Lola', type='Labrador', breed='null', age=3', weight=43', count=55'}
Inside no args constructor
deserializedPet = MyPet{name='Lola', type='Labrador', breed='null', age=3', weight=43', count=55'}
Process finished with exit code 0
*/