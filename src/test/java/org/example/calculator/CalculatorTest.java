package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
   public void shouldReturnSumWhenAddArrayIscalled() {
        float[] array = {3, 45, 6.7f, 12, 4.2f, 8.9f};

        Calculator calculator = new Calculator();
        float result = calculator.addArray(array);

        Assertions.assertEquals(79.799995f, result);
    }

@Test
    public void shouldReturnSumWhenSubtractIsCalled() {
        float[] array = {9, 11, 2.5f, 38, 1};
        Calculator calculator = new Calculator();
        float result = calculator.subtractArray(array);
        Assertions.assertEquals(-43, result);
    }

    @Test
    public void shouldReturnSumWhenDivideIsCalled() {
        float[] array = {200, 5, 10 ,1.6f, 20 };
        Calculator calculator = new Calculator();
        float result = calculator.divideArray(array);
        Assertions.assertEquals(0.125, result);
        }

        @Test
public void shouldReturnSumWhenMultiplyIsCalled() {
            float[] array = {5, 5.5f, 10, 2, 0.5f};
            Calculator calculator = new Calculator();
            float result = calculator.multiplyArray(array);
            Assertions.assertEquals(275, result);

        }
}