package AbstractFactory.Tree;

public abstract class Tree {
    protected int height;
    protected float leafLength;
    protected int leafNumber;

    public abstract void growTree();

    public int getHeight() {
        return height;
    }

    public float getLeafLength() {
        return leafLength;
    }

    public int getLeafNumber() {
        return leafNumber;
    }
}
