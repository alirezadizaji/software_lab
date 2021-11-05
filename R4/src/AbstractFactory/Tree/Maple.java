package AbstractFactory.Tree;

public class Maple extends Tree {

    @Override
    public void growTree() {
        this.height = 4;
        this.leafNumber = 50;
        this.leafLength = (float) 0.2;
    }
}

