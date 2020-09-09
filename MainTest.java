import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class MainTest {


    private int[] in;
    private int[] out;

    public MainTest(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    private Main number1;

    @Before
    public void startTest() {
        number1 = new Main();
    }

    @Test
    public void testAfterLast4() {
        Assert.assertArrayEquals(out, Main.toNewArr(in));
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Main.toNewArr(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }




}

