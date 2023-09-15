import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuthabenentwicklungTest {


    @Test
    void doesntRound() {
        double input = 199.95;
        assertEquals(input, Guthabenentwicklung.roundToTwoDigits(input));
    }
    @Test
    void onlyNumber() {
        double input = 1043;
        assertEquals(input, Guthabenentwicklung.roundToTwoDigits(input));
    }


}