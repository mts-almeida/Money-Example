package mts.money;

import org.junit.jupiter.api.Test;

class DollarTest {

    @Test
    public void testMultiplication() {
        Money five= Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

}