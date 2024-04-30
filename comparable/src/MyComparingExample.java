import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

class Shoes{
    String brand;
    String model;
    double prize;
    int size;
    Shoes(String brand, String model, double prize, int size){
        this.brand = brand;
        this.model = model;
        this.prize = prize;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", prize=" + prize +
                ", size=" + size +
                '}';
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrize() {
        return prize;
    }
    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

public class MyComparingExample {
    public static void main(String[] args) {
        List<Shoes> stock = new ArrayList<>(List.of(
                new Shoes("Clark","Desert boot",120.00,40),
                new Shoes("Clark","Desert boot",130.00,42),
                new Shoes("Clark","Desert boot",140.00,43),
                new Shoes("Clark","sneakers",100.00,40),
                new Shoes("Geox","sneakers",200.00,40),
                new Shoes("Geox","sneakers",210.00,42),
                new Shoes("Geox","mocassini",240.00,40),
                new Shoes("Sergio Rossi","sneakers",250.00,40))
        );
        System.out.println("My stock is " + stock);
        System.out.println("---- comparing by brand --------");
        stock.sort(Comparator.comparing(Shoes::getBrand));
        System.out.println("My stock By brand " + stock);
        System.out.println("---- comparing by brand and price --------");
        stock.sort(Comparator.comparing(Shoes::getBrand).thenComparingDouble(Shoes::getPrize));
        System.out.println("My stock by brand and price ");
        stock.forEach(s -> System.out.println(s.brand +"," + DecimalFormat.getInstance(Locale.ITALY).format(s.prize)));

        System.out.println("---- comparing by size and price from  smaller to bigger  --------");
        stock.sort( Comparator.comparing(Shoes::getSize).thenComparing(Comparator.comparing(Shoes::getPrize)));
        stock.forEach(s -> System.out.println(NumberFormat.getInstance(Locale.ITALY).format(s.getSize()) + ", "
                + NumberFormat.getInstance(Locale.ITALY).format(s.getPrize())));

        System.out.println("---- comparing by size and price from  bigger to smaller  --------");
        stock.sort( (Comparator.comparing(Shoes::getSize).thenComparing(Comparator.comparing(Shoes::getPrize))).reversed());
        stock.forEach(s -> System.out.println(NumberFormat.getInstance(Locale.ITALY).format(s.getSize()) + ", "
                + NumberFormat.getInstance(Locale.ITALY).format(s.getPrize())));
    }
}
/**
 ---- comparing by brand and price --------
 My stock by brand and price
 Clark,100
 Clark,120
 Clark,130
 Clark,140
 Geox,200
 Geox,210
 Geox,240
 Sergio Rossi,250
 ---- comparing by size and price from  smaller to bigger  --------
 40, 100
 40, 120
 40, 200
 40, 240
 40, 250
 42, 130
 42, 210
 43, 140
 ---- comparing by size and price from  bigger to smaller  --------
 43, 140
 42, 210
 42, 130
 40, 250
 40, 240
 40, 200
 40, 120
 40, 100

 Process finished with exit code 0

 */