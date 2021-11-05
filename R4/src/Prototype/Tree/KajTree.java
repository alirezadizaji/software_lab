package Prototype.Tree;

public class KajTree extends Tree{

    public KajTree(int height, int leafNumber) {
        super(height, leafNumber);
    }

    @Override
    public Tree clone_() {
        KajTree kajTreeClone = new KajTree(this.getHeight(), this.getLeafNumber());
        kajTreeClone.setColor(this.getColor());

        return kajTreeClone;
    }
}
