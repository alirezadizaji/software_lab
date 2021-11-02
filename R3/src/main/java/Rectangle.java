public class Rectangle extends Shape implements areaCalculation {
    private int width, height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}
