package AbstractFactory;

public class GardenProvider {
    public static GardenCreator getGarden(GardenType type) {

        GardenCreator creator = null;

        if (type.equals(GardenType.IRANIAN)) {
             creator = new IranianGardenCreator();
        } else {
            creator = new JapaneseGardenCreator();
        }

        creator.createTree();
        creator.createFlower();

        return creator;
    }
}
