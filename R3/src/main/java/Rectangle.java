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
        if (height <= 0)
            throw new Exception("Negative Rectangle");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) throws Exception{
        if (width <= 0)
            throw new Exception("Negative Rectangle");
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
