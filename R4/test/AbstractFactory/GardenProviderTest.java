package AbstractFactory;

import AbstractFactory.*;
import org.junit.Test;

import java.util.Map;

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
    public void test_grow_iranian_garden() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.IRANIAN);

        creator.growGarden();

        Rose flower = (Rose) creator.showFlower();
        Chenar tree = (Chenar) creator.showTree();

        assertEquals(flower.petal_number, 7);
        assertEquals(flower.color, FlowerColor.RED);
        assertEquals(tree.height, 3);
        assertEquals(tree.leaf_number, 100);
        assertEquals(tree.leaf_length, 0.3, 0.000001);
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

    @Test
    public void test_grow_japanese_garden() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.JAPANESE);

        creator.growGarden();

        Sakura flower = (Sakura) creator.showFlower();
        Maple tree = (Maple) creator.showTree();

        assertEquals(flower.petal_number, 5);
        assertEquals(flower.color, FlowerColor.PINK);
        assertEquals(tree.height, 4);
        assertEquals(tree.leaf_number, 50);
        assertEquals(tree.leaf_length, 0.2, 0.000001);
    }

}
