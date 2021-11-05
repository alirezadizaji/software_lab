package AbstractFactory.Tree;

public class Chenar extends Tree {

    @Override
    public void growTree() {
        this.height = 3;
        this.leafNumber = 100;
        this.leafLength = (float) 0.3;
    }

}
