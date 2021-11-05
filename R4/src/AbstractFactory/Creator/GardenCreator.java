package AbstractFactory.Creator;

import AbstractFactory.Flower.Flower;
import AbstractFactory.Tree.Tree;

public abstract class GardenCreator {
    protected Tree tree;
    protected Flower flower;

    public abstract void createTree();
    public abstract void createFlower();

    public Tree getTree() {
        return this.tree;
    }

    public Flower getFlower() {
        return this.flower;
    }

    public void growGarden() {
        this.flower.growPetal();
        this.tree.growTree();
    }
}
