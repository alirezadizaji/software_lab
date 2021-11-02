import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleAreaTest {
    @Test
    public void calculateArea1() throws Exception{
        int width = 3, height = 4;
        int myCalculation = width * height;
        Rectangle rectangle = new Rectangle(width, height);
        int calculatedArea = rectangle.calculateArea();
        assertEquals(myCalculation, calculatedArea);
    }
    @Test
    public void calculateArea2() throws Exception{
        int width = 2, height = 5;
        int myCalculation = width * height;
        Rectangle rectangle = new Rectangle(width, height);
        int calculatedArea = rectangle.calculateArea();
        assertEquals(myCalculation, calculatedArea);
    }
    @Test
    public void calculateArea3() throws Exception{
        int width = 10, height = 3;
        int myCalculation = width * height;
        Rectangle rectangle = new Rectangle(width, height);
        int calculatedArea = rectangle.calculateArea();
        assertEquals(myCalculation, calculatedArea);
    }
    @Test
    public void negativeRectangle() {
        int width = 0, height = 3;
        try {
            new Rectangle(width, height);
            assertEquals(1,0);
        } catch (Exception e)
        {
            assertEquals(e.getMessage(), "Negative Rectangle");
        }
    }
}
