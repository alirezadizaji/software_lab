import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void setEdge() throws Exception{
        Square square = new Square(5);
        int edge = 10;
        square.setEdge(edge);
        assertEquals(edge, square.getEdge());
    }

    @Test
    public void negativeSet() throws Exception{
        Square square = new Square(5);
        int edge = -7;
        try {
            square.setEdge(edge);
            assertEquals(1, 0);
        } catch (Exception e)
        {
            assertEquals(e.getMessage(), "Negative Square");
        }
    }

    @Test
    public void calculateArea1() throws Exception{
        int edge = 10;
        int myCalculation = edge * edge;
        Square square = new Square(edge);
        int calculatedArea = square.calculateArea();
        assertEquals(myCalculation, calculatedArea);
    }

    @Test
    public void calculateArea2() throws Exception{
        int edge = 23;
        int myCalculation = edge * edge;
        Square square = new Square(edge);
        int calculatedArea = square.calculateArea();
        assertEquals(myCalculation, calculatedArea);
    }

    @Test
    public void negativeSquare() throws Exception{
        int edge = -8;
        try {
            new Square(edge);
            assertEquals(1,0);
        } catch (Exception e)
        {
            assertEquals(e.getMessage(), "Negative Square");
        }
    }
}
