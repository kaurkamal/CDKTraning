import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kaurk on 7/26/2017.
 */
public class CarDemo {
    public static void main(String[] args) {
        CarIdComparator c2 = new CarIdComparator();
        CarBrandComparator c3 = new CarBrandComparator();
        CarNameComparator c4 = new CarNameComparator();
        Set<Car> car = new TreeSet<>();
        // Set<Car> car = new TreeSet<>(c2);
        //Set<Car> car = new TreeSet<>(c3);
        // Set<Car> car = new TreeSet<>(c4);

        car.add(new Car(200000.0, 101, "xyz", "abc"));
        car.add(new Car(300000, 103, "asd", "bmw"));
        car.add(new Car(550000.0, 56, "ere", "nnc"));
        car.add(new Car(220000, 105, "nmn", "ert"));
        car.add(new Car(1300000, 104, "jhjh", "assd"));
        car.add(new Car(340000, 100, "dgf", "afdf"));
        car.add(new Car(230000, 131, "erz", "assdg"));
        car.add(new Car(450000, 141, "fhz", "ghjhgj"));
        car.add(new Car(1340000, 121, "ffz", "adfgd"));
        car.add(new Car(5349000, 171, "sfz", "rter"));
        car.add(new Car(3450000, 109, "ettz", "nbnfd"));
        Iterator<Car> itr = car.iterator();

        while (itr.hasNext()) {
            Car cars = itr.next();
            System.out.println(cars.price + "  " + cars.id + " : " + cars.name + " : " + cars.brand);
        }

        System.out.println("====================");

    }
}
