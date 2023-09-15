import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuthabenentwicklungTest {

    @org.junit.jupiter.api.Test
    void roundsDown() {
        assertEquals(7.80, Guthabenentwicklung.rundenAufFuenfRappen(7.803));
    }

    @org.junit.jupiter.api.Test
    void roundsToFiveCents() {
        assertEquals(3.25, Guthabenentwicklung.rundenAufFuenfRappen(3.249));
    }

    @org.junit.jupiter.api.Test
    void roundsUpWithCarryOver() {
        assertEquals(200, Guthabenentwicklung.rundenAufFuenfRappen(199.995));
    }
}