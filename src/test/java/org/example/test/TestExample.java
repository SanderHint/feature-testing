package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {
    @Test
    public void shoudReturnCorrectAddedNumbers() {
        //Given
        final int a = 8;
        final int b = 55;

        //When
        final int addResult = a + b;

        //Then
        Assertions.assertEquals(63, addResult);
    }
}
