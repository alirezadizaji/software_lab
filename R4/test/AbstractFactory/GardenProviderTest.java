package AbstractFactory;

import AbstractFactory.Creator.GardenCreator;
import AbstractFactory.Creator.GardenType;
import AbstractFactory.Flower.FlowerColor;
import AbstractFactory.Flower.Rose;
import AbstractFactory.Flower.Sakura;
import AbstractFactory.Provider.GardenProvider;
import AbstractFactory.Tree.Chenar;
import AbstractFactory.Tree.Maple;
import org.junit.Test;

import static org.junit.Assert.*;

public class GardenProviderTest {

    @Test
    public void test_flower_type_iranian() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.IRANIAN);
        assertTrue(creator.getFlower() instanceof Rose);
    }

    @Test
    public void test_tree_type_iranian() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.IRANIAN);
        assertTrue(creator.getTree() instanceof Chenar);
    }

    @Test
    public void test_grow_iranian_garden() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.IRANIAN);

        creator.growGarden();

        Rose flower = (Rose) creator.getFlower();
        Chenar tree = (Chenar) creator.getTree();

        assertEquals(flower.getPetalNumber(), 7);
        assertEquals(flower.getColor(), FlowerColor.RED);
        assertEquals(tree.getHeight(), 3);
        assertEquals(tree.getLeafNumber(), 100);
        assertEquals(tree.getLeafLength(), 0.3, 0.000001);
    }

    @Test
    public void test_flower_type_japanese() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.JAPANESE);
        assertTrue(creator.getFlower() instanceof Sakura);
    }

    @Test
    public void test_tree_type_japanese() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.JAPANESE);
        assertTrue(creator.getTree() instanceof Maple);
    }

    @Test
    public void test_grow_japanese_garden() {
        GardenCreator creator = GardenProvider.getGarden(GardenType.JAPANESE);

        creator.growGarden();

        Sakura flower = (Sakura) creator.getFlower();
        Maple tree = (Maple) creator.getTree();

        assertEquals(flower.getPetalNumber(), 5);
        assertEquals(flower.getColor(), FlowerColor.PINK);
        assertEquals(tree.getHeight(), 4);
        assertEquals(tree.getLeafNumber(), 50);
        assertEquals(tree.getLeafLength(), 0.2, 0.000001);
    }

}
