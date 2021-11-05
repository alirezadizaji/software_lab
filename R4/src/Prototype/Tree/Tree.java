package Prototype.Tree;

public abstract class Tree {
    protected int height;
    protected int leafNumber;
    protected ColorType color;

    Tree(int height, int leafNumber) {
        this.height = height;
        this.leafNumber = leafNumber;
    }

    Tree(int leafNumber, ColorType color) {
        this.leafNumber = leafNumber;
        this.color = color;
    }

    public abstract Tree clone_();

    public int getLeafNumber() {
        return leafNumber;
    }

    public int getHeight() {
        return height;
    }

    public ColorType getColor() {
        return color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }
}
