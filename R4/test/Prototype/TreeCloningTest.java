package Prototype;

import Prototype.Tree.ColorType;
import Prototype.Tree.KajTree;
import Prototype.Tree.TabriziTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeCloningTest {

    @Test
    public void test_create_copy_of_tabrizi_tree() {

        TabriziTree tabriziTree = new TabriziTree(200, ColorType.GREEN);
        tabriziTree.setHeight(150);

        TabriziTree tabriziTreeClone = (TabriziTree) tabriziTree.clone_();
        tabriziTreeClone.setHeight(200);

        assertEquals(tabriziTree.getHeight(), 150);
        assertEquals(tabriziTreeClone.getHeight(), 200);
        assertEquals(tabriziTree.getColor(), tabriziTreeClone.getColor());
        assertEquals(tabriziTree.getLeafNumber(), tabriziTreeClone.getLeafNumber());
    }

    @Test
    public void test_create_copy_of_kaj_tree() {

        KajTree kajTree = new KajTree(3, 200);
        kajTree.setColor(ColorType.LIGHTGREEN);

        KajTree kajTreeClone = (KajTree) kajTree.clone_();
        kajTreeClone.setColor(ColorType.DARKGREEN);

        assertEquals(kajTree.getColor(), ColorType.LIGHTGREEN);
        assertEquals(kajTreeClone.getColor(), ColorType.DARKGREEN);
        assertEquals(kajTree.getHeight(), kajTreeClone.getHeight());
        assertEquals(kajTree.getLeafNumber(), kajTreeClone.getLeafNumber());
    }
}
