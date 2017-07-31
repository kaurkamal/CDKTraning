import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by kaurk on 7/28/2017.
 */
public class NumberService {
    int arr[];

    public NumberService(int[] arr) {
        this.arr = arr;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int num : arr) {
            consumer.accept(num);
        }

    }

    public void modify(Function<Integer, Integer> function) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = function.apply(arr[i]);
        }

    }

    public int fold(BiFunction<Integer, Integer, Integer> bifunction) {
        int i = 0;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = bifunction.apply(arr[i], arr[i + 1]);
        }
        return arr[i];
    }

    public void delete(Predicate<Integer> predicate) {
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                position = i;
            }
        }
        for ( int c = position; c < arr.length - 1; c++) {
            arr[c] = arr[c + 1];
        }
    }

}
