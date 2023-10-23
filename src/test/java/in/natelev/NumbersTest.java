package in.natelev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumbersTest {
    @Test
    public void testNumbers() {
        assertEquals("num is 0", 0, Numbers.num);
    }
}
