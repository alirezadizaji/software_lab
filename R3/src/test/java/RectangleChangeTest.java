import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleChangeTest {
    @Test
    public void setWidth() throws Exception{
        Rectangle rectangle = new Rectangle(5, 7);
        int width = 10;
        rectangle.setWidth(width);
        assertEquals(width, rectangle.getWidth());
    }

    @Test
    public void setHeight() throws Exception{
        Rectangle rectangle = new Rectangle(5, 7);
        int height = 10;
        rectangle.setHeight(height);
        assertEquals(height, rectangle.getHeight());
    }

    @Test
    public void negativeSet() throws Exception{
        Rectangle rectangle = new Rectangle(5, 7);
        int height = -1;
        try {
            rectangle.setHeight(height);
            assertEquals(1, 0);
        } catch (Exception e)
        {
            assertEquals(e.getMessage(), "Negative Rectangle");
        }
    }
}
