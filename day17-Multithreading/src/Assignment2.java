import java.util.concurrent.*;

/**
 * Created by kaurk on 8/2/2017.
 */
public class Assignment2 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> future[] = new Future[5];
        future[0] = executor.submit(new SumPrimeTask(1, 100));
        future[1] = executor.submit(new SumPrimeTask(101, 200));
        future[2] = executor.submit(new SumPrimeTask(201, 300));
        future[3] = executor.submit(new SumPrimeTask(301, 400));
        future[4] = executor.submit(new SumPrimeTask(401, 500));

        try {
            for (int i = 0; i < future.length; i++) {
                if (!future[i].isCancelled()) {
                    int rs = future[i].get();
                    System.out.printf("Result : %d%n", rs);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted!!!");
        } catch (ExecutionException e) {
            System.out.println("Task can not be executed!!!");
        } catch (CancellationException e) {
            System.out.println("Task already got cancelled!!!");
        }

    }
}

class SumPrimeTask implements Callable<Integer> {
    int start;
    int end;

    public SumPrimeTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber && i != 1) {
                sum += i;
            }
        }
        return sum;
    }
}
