package AbstractFactory;

public class Sakura implements Flower{

    int petal_number = 0;
    FlowerColor color = null;

    @Override
    public void growPetal() {
        this.petal_number = 5;
        this.color = FlowerColor.PINK;
    }
}
