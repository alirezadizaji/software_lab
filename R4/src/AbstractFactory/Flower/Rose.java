package AbstractFactory.Flower;

public class Rose extends Flower {

    @Override
    public void growPetal() {
        this.petalNumber = 7;
        this.color = FlowerColor.RED;
    }
}
