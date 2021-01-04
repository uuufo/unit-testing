import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {

    @Test
    void multiply() {
        assertEquals(15, Testing.multiply(5, 3), "5 x 3 must return 15");
    }
}