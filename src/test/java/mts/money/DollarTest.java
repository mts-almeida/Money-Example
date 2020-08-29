package mts.money;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @org.junit.jupiter.api.Test
    public void testMultiplication() {
        Dollar five= new Dollar(5);
        Dollar product= five.times(2);
        assertEquals(10, five.amount);
        product= five.times(3);
        assertEquals(15, five.amount);
    }
}