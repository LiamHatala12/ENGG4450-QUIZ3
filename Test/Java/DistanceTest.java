import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void chebyshevDistance() {
        assertEquals(4, Distance.chebyshevDistance(new long[]{3, 5}, new long[]{6, 9}));
        assertEquals(0, Distance.chebyshevDistance(new long[]{1, 2}, new long[]{1, 2}));
    }

    @Test
    void squaredDistance() {
        assertEquals(25.0, Distance.squaredDistance(0, 0, 3, 4));
        assertEquals(0.0, Distance.squaredDistance(1, 1, 1, 1));
    }

    @Test
    void euclideanDistance() {
        assertEquals(5.0, Distance.euclideanDistance(0, 0, 3, 4), 0.001);
        assertEquals(0.0, Distance.euclideanDistance(1, 1, 1, 1), 0.001);
    }
}