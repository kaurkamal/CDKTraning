import java.io.File;
import java.io.FileWriter;
import java.util.*;

/**
 * Created by kaurk on 7/27/2017.
 */
public class CarsTest {
    public static void main(String[] args) {
        Set<Cars> cars = new HashSet<>();
        cars.add(new Cars("bmw"));
        cars.add(new Cars("Maruti"));
        cars.add(new Cars("audi"));
        cars.add(new Cars("zen"));
        Iterator itr = cars.iterator();
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:/movie/car.txt");
            Cars c = new Cars();
            while (itr.hasNext()) {
                c = (Cars) itr.next();
                writer.write(c.getName() + "   ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

