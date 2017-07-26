import java.util.Comparator;

/**
 * Created by kaurk on 7/26/2017.
 */
public class CarIdComparator implements Comparator<Car> {
    public int compare(Car car1,Car car2){
        return car1.id - car2.id;
    }

}
