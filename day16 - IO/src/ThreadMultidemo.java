import org.junit.Test;

/**
 * Created by kaurk on 7/31/2017.
 */
public class ThreadMultidemo {
    int i = 3;

    @Test
    public void testThreadMultiDemo() {
        int j = 0;
        while (j < 20) {
            Thread thread1 = new Thread(() -> i++);
            thread1.start();
            Thread thread2 = new Thread(() -> System.out.println(i));
            thread2.start();
            j++;
        }


    }
}
