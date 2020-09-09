import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


    @RunWith(Parameterized.class)
    public class MainTest2 {
        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{1, 1, 4, 4, 4, 1, 4, 1}, true},
                    {new int[]{8, 8, 7, 7, 7, 3, 5, 1}, false},
                    {new int[]{1, 4, 8, 7}, false}
            });
        }

        private int[] in;
        private boolean out;

        public MainTest2(int[] in, boolean out) {
            this.in = in;
            this.out = out;
        }

        private Main number2;

        @Before
        public void startTest() {
            number2 = new Main();
        }

        @Test
        public void testOnly1And4() {
            Assert.assertEquals(Main.checkArrContent(in), out);
        }
    }
