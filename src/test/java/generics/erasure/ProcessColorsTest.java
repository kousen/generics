package generics.erasure;

import generics.erasure.ProcessColors;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class ProcessColorsTest {
    private ProcessColors processColors = new ProcessColors();
    private Color color = new Color(100, 50, 0);

    @Before
    public void setUp() {
        processColors.setColor(color);
    }

    @Test
    public void noProcessing() {
        Color c = processColors.applyFilter(color -> color);
        assertEquals(new Color(100, 50, 0), c);
    }

    @Test
    public void makeBrighter() {
        Color c = processColors.applyFilter(Color::brighter);
        assertEquals(new Color(142, 71, 0), c);
    }

    @Test
    public void makeDarker() {
        Color c = processColors.applyFilter(Color::darker);
        assertEquals(new Color(70, 35, 0), c);
    }

    @Test
    public void makeBrighterThenDarker() {
        Color c = processColors.applyFilters(
                Color::brighter, Color::darker);
        assertEquals(new Color(99, 49, 0), c);
    }
}