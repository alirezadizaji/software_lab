package AbstractFactory;

public class Rose implements Flower {

    int petal_number = 0;
    FlowerColor color = null;

    @Override
    public void growPetal() {
        this.petal_number = 7;
        this.color = FlowerColor.RED;
    }

}
