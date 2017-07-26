/**
 * Created by kaurk on 7/26/2017.
 */
public class Car implements Comparable<Car> {
    public double price;
    public int id;
    public String name;
    public String brand;

    public Car(double price,int id, String name, String brand) {
        this.price = price;
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    public int compareTo(Car c) {
        if (this.price == c.price)
            return 0;
        else if (this.price > c.price) {
            return -1;
        }
        return 1;
    }
}
