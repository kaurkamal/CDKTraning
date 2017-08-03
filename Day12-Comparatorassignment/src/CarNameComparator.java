import java.util.Comparator;

/**
 * Created by kaurk on 7/26/2017.
 */
public class CarNameComparator implements Comparator<Car> {

    public int compare(Car car1, Car car2) {
        return car1.name.compareTo(car2.name);
    }

}