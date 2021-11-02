public class Rectangle extends Shape implements areaCalculation {
    private int width, height;
    public Rectangle(int width, int height) throws Exception{
        if (width <= 0 || height <= 0)
            throw new Exception("Negative Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return this.width * this.height;
    }

    public void setHeight(int height) throws Exception{

    }

    public int getHeight() {
        return 0;
    }

    public void setWidth(int width) throws Exception{

    }

    public int getWidth() {
        return 0;
    }
}
