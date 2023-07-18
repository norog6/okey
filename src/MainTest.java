import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private static final String attempt = "asdsa";
    private static final String word = "asdsa";
    private static final Color[] colors = new Color[]{Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN};

    @Test
    @Order(1)
    void main() {
        assertArrayEquals(Main.wordle(attempt, word), colors);
    }
}