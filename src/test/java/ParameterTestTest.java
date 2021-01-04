import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ParameterTestTest {

    public static int[][] testData() {
        return new int[][] {
                {5 , 3, 15}, {30, 1, 30}, {40, 10, 400}
        };
    }

    @ParameterizedTest
    @MethodSource("testData")
    void multiply(int[] data) {
        int d1 = data[0];
        int d2 = data[1];
        int expected = data[2];
        assertEquals(expected, ParameterTest.multiply(d1, d2));
    }
}



