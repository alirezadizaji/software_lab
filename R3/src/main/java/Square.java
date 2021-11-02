public class Square extends Shape implements areaCalculation {
    private int edge;
    public Square(int edge) throws Exception{
        if (edge <= 0)
            throw new Exception("Negative Square");
        this.edge = edge;
    }

    @Override
    public int calculateArea() {
        return this.edge * this.edge;
    }

    public void setEdge(int edge) throws Exception{
        if (edge <= 0)
            throw new Exception("Negative Square");
        this.edge = edge;
    }

    public int getEdge() {
        return this.edge;
    }
}
