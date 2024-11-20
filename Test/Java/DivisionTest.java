import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void division() {
        assertEquals(2, Division.division(4, 2));
        assertEquals(-2, Division.division(4, -2));
        assertThrows(ArithmeticException.class, () -> Division.division(4, 0)); // Division by zero
    }

    @Test
    void divisionUsingLoop() {
        assertEquals(3, Division.divisionUsingLoop(9, 3));
        assertEquals(-2, Division.divisionUsingLoop(8, -4));
    }

    @Test
    void divisionUsingRecursion() {
        assertEquals(3, Division.divisionUsingRecursion(9, 3));
        assertEquals(0, Division.divisionUsingRecursion(1, 2)); // Division that results in zero
    }

    @Test
    void divisionUsingMultiplication() {
        assertEquals(2, Division.divisionUsingMultiplication(8, 4));
        assertEquals(-3, Division.divisionUsingMultiplication(15, -5));
    }

    @Test
    void divisionUsingShift() {
        assertEquals(4, Division.divisionUsingShift(16, 4));
        assertEquals(1, Division.divisionUsingShift(8, 7)); // Approximation check
    }

    @Test
    void divisionUsingLogs() {
        assertEquals(2, Division.divisionUsingLogs(100, 50));
        assertEquals(-3, Division.divisionUsingLogs(27, -9));
    }
}