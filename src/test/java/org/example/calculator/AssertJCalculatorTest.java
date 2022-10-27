package org.example.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Write some AssertJ tests for Calculator methods in a separate file 'AssertCalculatorTest'
 */
public class AssertJCalculatorTest {
    @Test
    public void shouldAddArray() {
        float[] testArray = {1, 32, 45.6f, 3};
        Calculator calculator = new Calculator();
        float result = calculator.addArray(testArray);

        assertThat(result).isEqualTo(81.6f);
    }

    @Test
    public void shouldSubtractArray() {
        float[] testArray = {9, 11, 2.5f, 38, 1};
        Calculator calculator = new Calculator();
        float result = calculator.subtractArray(testArray);
        assertThat(result).isEqualTo(-61.5f);
    }

    @Test
    public void shouldMultiplyArray() {
        float[] testArray = {5, 5.5f, 10, 2, 0.5f};
        Calculator calculator = new Calculator();
        float result = calculator.multiplyArray(testArray);
        assertThat(result).isEqualTo(0.0f);
    }

    @Test
    public void shouldDivideArray() {
        float[] testArray = {200, 5, 10 ,1.6f, 20};
        Calculator calculator = new Calculator();
        float result = calculator.divideArray(testArray);

        assertThat(result).isEqualTo(0.0f);
    }

}