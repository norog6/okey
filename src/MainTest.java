import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private static final String attempt1 = "asdsa", attempt2="hello",attempt3="divan",attempt4="rules";
    private static final String word1 = "asdsa", word2="abaca",word3="nadiv",word4="rebus";
    private static final Color[] colors1 = new Color[]{Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN};
    private static final Color[] colors2 = new Color[]{Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK};
    private static final Color[] colors3 = new Color[]{Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.YELLOW};
    private static final Color[] colors4 = new Color[]{Color.GREEN, Color.YELLOW, Color.BLACK, Color.YELLOW, Color.GREEN};

    @Test
    @Order(1)
    void main1() {
        assertArrayEquals(Main.wordle(attempt1, word1), colors1);
    }
    @Test
    @Order(2)
    void main2() {
        assertArrayEquals(Main.wordle(attempt2, word2), colors2);
    }@Test
    @Order(3)
    void main3() {
        assertArrayEquals(Main.wordle(attempt3, word3), colors3);
    }@Test
    @Order(4)
    void main4() {
        assertArrayEquals(Main.wordle(attempt4, word4), colors4);
    }
}