package AbstractFactory.Provider;

import AbstractFactory.Creator.GardenCreator;
import AbstractFactory.Creator.GardenType;
import AbstractFactory.Creator.IranianGardenCreator;
import AbstractFactory.Creator.JapaneseGardenCreator;

public class GardenProvider {
    public static GardenCreator getGarden(GardenType type) {

        GardenCreator creator;

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
