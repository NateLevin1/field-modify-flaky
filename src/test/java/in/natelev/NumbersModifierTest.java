package in.natelev;

import org.junit.Test;

public class NumbersModifierTest {
    // polluter
    @Test
    public void testAdd() {
        NumbersModifier numbersModifier = new NumbersModifier();
        numbersModifier.add(10);
    }
    
    // cleaner
    @Test
    public void testReset() {
        NumbersModifier numbersModifier = new NumbersModifier();
        numbersModifier.reset();
    }
}
