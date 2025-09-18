import main.Lecture_12.FactorialCalculator;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720",
            "7, 5040",
            "8, 40320",
            "9, 362880",
            "10, 3628800"
    })
    void testFactorialOfPositiveNumbers(int input, long expected) {
        assertEquals(expected, FactorialCalculator.factorial(input));
    }

    @Test
    void testFactorialThrowsForNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.factorial(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, -10, -100})
    void testFactorialThrowsForAllNegativeNumbers(int input) {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.factorial(input));
    }

    @Test
    void testFactorialEdgeCases() {
        assertAll(
                () -> assertEquals(1, FactorialCalculator.factorial(0)),
                () -> assertEquals(1, FactorialCalculator.factorial(1)),
                () -> assertEquals(2, FactorialCalculator.factorial(2)),
                () -> assertEquals(3628800, FactorialCalculator.factorial(10))
        );
    }
}