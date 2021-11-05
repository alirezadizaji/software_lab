package AbstractFactory;

public class JapaneseGardenCreator implements GardenCreator{

    private Tree tree = null;
    private Flower flower = null;

    @Override
    public void createFlower() {
        flower = new Sakura();
    }

    @Override
    public void createTree() {
        tree = new Maple();
    }

    @Override
    public Tree showTree() {
        return tree;
    }

    @Override
    public Flower showFlower() {
        return flower;
    }
}
