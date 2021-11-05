package AbstractFactory.Flower;

public class Sakura extends Flower{

    @Override
    public void growPetal() {
        this.petalNumber = 5;
        this.color = FlowerColor.PINK;
    }
}
