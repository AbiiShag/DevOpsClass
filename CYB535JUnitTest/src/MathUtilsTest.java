import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(8, mathUtils.add(5, 3));
        assertEquals(-1, mathUtils.add(-5, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertEquals(-8, mathUtils.subtract(-5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, mathUtils.multiply(5, 3));
        assertEquals(-15, mathUtils.multiply(5, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0);
        assertEquals(-2.0, mathUtils.divide(-6, 3), 0);
        assertEquals(0.0, mathUtils.divide(0, 3), 0);
        assertEquals(-1.0, mathUtils.divide(5, 0), 0);
    }
}
