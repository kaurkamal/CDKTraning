import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by kaurk on 8/1/2017.
 */
public class Assinment1 {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                try {
                    blockingQueue.put((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    System.out.println(blockingQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        );
        thread2.start();

    }

}

