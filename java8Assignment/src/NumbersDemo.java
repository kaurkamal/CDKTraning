import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.function.Consumer;

/**
 * Created by kaurk on 7/28/2017.
 */
public class NumbersDemo {
    int arr[] = new int[]{20,10,30,50,80};

    @Test
    public void testforeach(){
        NumberService num = new NumberService(arr);
        num.forEach((Integer n) -> {
            System.out.println(n);});

        }
        @Test
        public void testmodify(){
        NumberService num1 = new NumberService(arr);
        num1.modify((n1) -> n1*2);
        num1.modify((n1) -> (n1+2));
        num1.forEach((n1) -> System.out.println(n1) );
}
    @Test
    public void testfold(){
            NumberService num = new NumberService(arr);
            int res = num.fold((n1,n2)->{
                int result = n1 + n2;
                return result;
            });
        System.out.println("SUM IS " + res);

    }
    @Test
    public void testdelete(){
        NumberService num = new NumberService(arr);
        num.delete(n1-> n1 == 30);
        num.forEach(n1-> System.out.println(n1));
        }


    }

