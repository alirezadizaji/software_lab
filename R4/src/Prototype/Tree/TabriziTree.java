package Prototype.Tree;

public class TabriziTree extends Tree{

    public TabriziTree(int leafNumber, ColorType color) {
        super(leafNumber, color);
    }

    @Override
    public Tree clone_() {
        TabriziTree tabriziTreeClone = new TabriziTree(this.getLeafNumber(), this.getColor());
        tabriziTreeClone.setHeight(this.getHeight());

        return tabriziTreeClone;
    }
}
