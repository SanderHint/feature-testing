package org.example.calculator;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;

    // This method will be called before ALL the methods/tests below
    @BeforeAll
    public static void setup(){
        System.out.println("Starting calculator tests....");
        float[] testArray = new float[]{3, 45, 6.7f, 12, 4.2f, 8.9f};
    }


    // This method is called before start run of EACH test
    @BeforeEach
    public void setupEach() {
        calculator = new Calculator();
    }

    @Test
   public void shouldReturnSumWhenAddArrayIscalled() {
        float[] array = {3, 45, 6.7f, 12, 4.2f, 8.9f};

        float result = calculator.addArray(array);

        Assertions.assertEquals(79.799995f, result);
    }

@Test
    public void shouldReturnSumWhenSubtractIsCalled() {
        float[] array = {9, 11, 2.5f, 38, 1};

        float result = calculator.subtractArray(array);

        Assertions.assertEquals(-61.5f, result);
    }

    // This ethod will be called after the run of EACH test
    @AfterEach
    public void finalSetupEach() {
        System.out.println("This test is finished running!");
    }

    // This method will be called after running ALL the methods
    @AfterAll
    public static void finalSetupGlobal() {
        System.out.println("Calculator tests are finished successfully!");
    }
    @Test
    @Disabled
    public void shouldReturnSumWhenDivideIsCalled() {
        float[] array = {200, 5, 10 ,1.6f, 20 };

        float result = calculator.divideArray(array);

        Assertions.assertEquals(0.0f, result);
        }

        @Test

public void shouldReturnSumWhenMultiplyIsCalled() {
            float[] array = {5, 5.5f, 10, 2, 0.5f};

            float result = calculator.multiplyArray(array);

            Assertions.assertAll(() -> Assertions.assertTrue(result >= 0),
                    () -> Assertions.assertEquals(0.0f, result));

        }

}