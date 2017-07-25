import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by kaurk on 7/17/2017.
 */
public class Test1 {
    @Test
    public void isPrime2() {
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(2);
        Assert.assertEquals( "wrong output",expectedOutput, PrimeNoGenerator.getArrayList(2));
    }

    @Test
    public void isPrime5() {
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(2);
        expectedOutput.add(3);
        expectedOutput.add(5);
        Assert.assertEquals( "wrong output",expectedOutput, PrimeNoGenerator.getArrayList(5));
    }
}
