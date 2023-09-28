import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditDevelopmentTest {


    @Test
    void doesntRound() {
        double input = 199.95;
        assertEquals(input, Calculations.roundToTwoDigits(input));
    }
    @Test
    void onlyNumber() {
        double input = 1043;
        assertEquals(input, Calculations.roundToTwoDigits(input));
    }
    @Test
    void roundedCorrectly() {
        double input = 1043.3333;
        assertEquals(1043.35, Calculations.roundToTwoDigits(input));
    }

}

