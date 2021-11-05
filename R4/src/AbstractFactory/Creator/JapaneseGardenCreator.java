package AbstractFactory.Creator;

import AbstractFactory.Flower.Flower;
import AbstractFactory.Flower.Sakura;
import AbstractFactory.Tree.Tree;
import AbstractFactory.Tree.Maple;

public class JapaneseGardenCreator extends GardenCreator{

    @Override
    public void createFlower() {
        this.flower = new Sakura();
    }

    @Override
    public void createTree() {
        this.tree = new Maple();
    }

}
