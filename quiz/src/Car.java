import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    String model;
    String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getColor());
    }

    public static void main(String[] args) {
        Car car1 = new Car("Panda","gialla");
        Car car2 = new Car("Panda","gialla");

        if(car1 == car2)
            System.out.println("Hello");

        if (car1.equals(car2))
            System.out.println("Hello");

    }

}
