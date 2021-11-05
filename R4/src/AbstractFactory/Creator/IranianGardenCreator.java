package AbstractFactory.Creator;

import AbstractFactory.Flower.Flower;
import AbstractFactory.Flower.Rose;
import AbstractFactory.Tree.Chenar;

public class IranianGardenCreator extends GardenCreator{

    @Override
    public void createFlower() {
        this.flower = new Rose();
    }

    @Override
    public void createTree() {
        this.tree = new Chenar();
    }

}
