import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by kaurk on 8/1/2017.
 */
public class ExecutorServiceDemo {


    public static void main(String[] args) {

        SumTask sumTask = new SumTask();
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 500; i++) {
            executor.execute(sumTask);
        }
    }
}


class SumTask implements Runnable {

    public void run() {
        int sum = 500;
        for (int i = 1; i <= 500; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
