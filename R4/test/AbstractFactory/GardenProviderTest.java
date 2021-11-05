package AbstractFactory;

import AbstractFactory.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GardenProviderTest {

    @Test
    public void test_flower_type_iranian() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.IRANIAN);
        assertTrue(creator.showFlower() instanceof Rose);
    }

    @Test
    public void test_tree_type_iranian() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.IRANIAN);
        assertTrue(creator.showTree() instanceof Chenar);
    }

    @Test
    public void test_flower_type_japanese() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.JAPANESE);
        assertTrue(creator.showFlower() instanceof Sakura);
    }

    @Test
    public void test_tree_type_japanese() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.JAPANESE);
        assertTrue(creator.showTree() instanceof Maple);
    }
}
