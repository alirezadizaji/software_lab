package AbstractFactory;

public class IranianGardenCreator implements GardenCreator{

    private Tree tree = null;
    private Flower flower = null;

    @Override
    public void createFlower() {
        flower = new Rose();
    }

    @Override
    public void createTree() {
        tree = new Chenar();
    }

    @Override
    public void growGarden() {
        tree.grow();
        flower.growPetal();
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
