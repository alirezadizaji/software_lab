package AbstractFactory;

public interface GardenCreator {
    void createFlower();
    void createTree();
    void growGarden();
    Tree showTree();
    Flower showFlower();
}
