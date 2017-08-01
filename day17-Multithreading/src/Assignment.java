import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by kaurk on 8/1/2017.
 */
public class Assignment {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        producer.start();
        consumer.start();

    }

}

class Producer extends Thread {
    LinkedBlockingQueue<Integer> queue = null;

    public Producer(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                queue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    LinkedBlockingQueue<Integer> queue = null;

    public Consumer(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
