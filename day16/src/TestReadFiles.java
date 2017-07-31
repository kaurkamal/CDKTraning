import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by kaurk on 7/31/2017.
 */
public class TestReadFiles {
    public static void main(String[] args) {
            Readfile1 readfile1  = new Readfile1();
            ReadFile2 readFile2  = new ReadFile2();
            Thread t1 = new Thread(readfile1);
            Thread t2 = new Thread(readFile2);
            t1.start();
            t2.start();


        }
    }

