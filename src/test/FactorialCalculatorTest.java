import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    void testFactorialOfTwo() {
        assertEquals(2, FactorialCalculator.factorial(2));
    }

    @Test
    void testFactorialOfThree() {
        assertEquals(6, FactorialCalculator.factorial(3));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, FactorialCalculator.factorial(10));
    }

    @Test
    void testFactorialThrowsForNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.factorial(-1));
    }

    @Test
    void testFactorialThrowsForAllNegativeNumbers() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class,
                        () -> FactorialCalculator.factorial(-5)),
                () -> assertThrows(IllegalArgumentException.class,
                        () -> FactorialCalculator.factorial(-10))
        );
    }
}