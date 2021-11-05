package AbstractFactory;

public class Maple implements Tree{

    int height = 1;
    float leaf_length = (float) 0.05;
    int leaf_number = 5;

    @Override
    public void grow() {
        this.height = 4;
        this.leaf_number = 50;
    }

    @Override
    public void blossom() {
        this.leaf_length = (float) 0.2;
    }
}

