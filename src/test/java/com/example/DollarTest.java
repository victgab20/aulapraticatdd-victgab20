package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Dollar {
    int amount;
    Dollar(int amount) {
       this.amount= amount;
    }
    void times(int multiplier) {
       amount= amount * multiplier;
    }
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
     }
}
