package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * AssertJ Examples
 *
 * @author Sander Hintsov
 */

public class AssertJExamples {

    @Test
    public void testString(){
        final String str = "Estonia is a silicone valley of Europe!";
        final String expected = "Estonia is a silicone valley of Europe!";

        Assertions.assertThat(str).isEqualTo(expected);
    }

    @Test
    public void testIntegerList() {
        List<Integer> numlist = List.of(1, 5, 8, 23, 100);

        Assertions.assertThat(numlist).hasSize(5)
        .contains(23);
    }

    @Test
    public void testString2() {
        final String testString = "Stranger things is an awesome Netflix drama!";

        Assertions.assertThat(testString).endsWith("drama!")
                .doesNotStartWith("Estonia")
                .isNotBlank()
                .isMixedCase()
                .contains(" ");
    }

    @Test
    public void testFloatList() {
        List<Float> floatList = List.of(2.3F, 5.7F, 6.8F, 2.45F, 5.98F, 90.34F, 100.23F);

        Assertions.assertThat(floatList).hasSize(7)
                .contains(6.8F)
                .doesNotHaveDuplicates()
                .containsExactlyInAnyOrder(2.3F, 5.7F, 6.8F, 2.45F, 5.98F, 90.34F, 100.23F)
                .startsWith(2.3F);
    }
}
