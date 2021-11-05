package AbstractFactory;

public class Chenar implements Tree{

    int height = 1;
    float leaf_length = (float) 0.1;
    int leaf_number = 2;

    @Override
    public void grow() {
        this.height = 3;
        this.leaf_number = 100;
    }

    @Override
    public void blossom() {
        this.leaf_length = (float) 0.3;
    }

}
