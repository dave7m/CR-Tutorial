import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("JUnit 5 Point Test")
public class TestPoint {

    private int coordX = (int) (Math.random() * 100);
    private int coordY = (int) (Math.random() * 100);

    @Test
    @DisplayName("coordX stored correctly")
    void coordXEqual() {
        Point p = new Point(coordX, coordY);
        assertEquals(p.coordX, coordX);
    }

    @Test
    @DisplayName("coordY stored correctly")
    void coordYEqual() {
        Point p = new Point(coordX, coordY);
        assertEquals(p.coordY, coordY);
    }

}
