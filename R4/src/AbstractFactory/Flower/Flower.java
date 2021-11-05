package AbstractFactory.Flower;

public abstract class Flower {

    protected int petalNumber;
    protected FlowerColor color;

    public abstract void growPetal();

    public int getPetalNumber() {
        return this.petalNumber;
    }

    public FlowerColor getColor() {
        return this.color;
    }
}
