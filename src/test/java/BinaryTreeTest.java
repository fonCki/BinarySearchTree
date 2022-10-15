import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    BinarySearchTree<Integer> integerTree;
    BinarySearchTree<String> stringTree;

    @BeforeEach
    void setUp() {
        integerTree = new BinarySearchTree();
        stringTree = new BinarySearchTree();

        //insert 50 integers randomly to a integer tree without loop
        integerTree.insert(75);
        integerTree.insert(50);
        integerTree.insert(12);
        integerTree.insert(25);
        integerTree.insert(37);
        integerTree.insert(6);
        integerTree.insert(87);
        integerTree.insert(62);
        integerTree.insert(18);
        integerTree.insert(31);
        integerTree.insert(43);
        integerTree.insert(56);
        integerTree.insert(93);
        integerTree.insert(68);
        integerTree.insert(3);
        integerTree.insert(9);
        integerTree.insert(81);
        integerTree.insert(21);
        integerTree.insert(15);
        integerTree.insert(27);
        integerTree.insert(34);
        integerTree.insert(40);
        integerTree.insert(48);
        integerTree.insert(53);
        integerTree.insert(60);
        integerTree.insert(70);
        integerTree.insert(76);
        integerTree.insert(84);
        integerTree.insert(90);
        integerTree.insert(96);
        integerTree.insert(99);

        //insert 50 countries string randomly to a string tree without loop
        stringTree.insert("China");
        stringTree.insert("India");
        stringTree.insert("United States");
        stringTree.insert("Indonesia");
        stringTree.insert("Brazil");
        stringTree.insert("Pakistan");
        stringTree.insert("Nigeria");
        stringTree.insert("Bangladesh");
        stringTree.insert("Russia");
        stringTree.insert("Mexico");
        stringTree.insert("Japan");
        stringTree.insert("Ethiopia");
        stringTree.insert("Philippines");
        stringTree.insert("Egypt");
        stringTree.insert("Vietnam");
        stringTree.insert("DR Congo");
        stringTree.insert("Germany");
        stringTree.insert("Turkey");
        stringTree.insert("Iran");
        stringTree.insert("Thailand");
        stringTree.insert("United Kingdom");
        stringTree.insert("France");
        stringTree.insert("Italy");
        stringTree.insert("Tanzania");
        stringTree.insert("South Africa");
        stringTree.insert("Myanmar");
        stringTree.insert("South Korea");
        stringTree.insert("Colombia");
        stringTree.insert("Kenya");
        stringTree.insert("Spain");
        stringTree.insert("Argentina");

    }


    @Test
    void getRoot() {
        //Testing the root of the integer tree and string tree
        assertEquals(75, integerTree.getRoot().getElement());
        assertEquals("China", stringTree.getRoot().getElement());
    }


    @Test
    void isEmpty() {
        //Testing the isEmpty method of the integer tree and string tree
        assertFalse(integerTree.isEmpty());
        assertFalse(stringTree.isEmpty());

        //Testing the isEmpty method of the integer tree and string tree after clear
        integerTree.reset();
        stringTree.reset();
        assertTrue(integerTree.isEmpty());
    }

    @Test
    void size() {
        //Testing the size method of the integer tree and string tree
        assertEquals(31, integerTree.size());
        assertEquals(31, stringTree.size());

        //Testing the size method of the integer tree and string tree after clear
        integerTree.reset();
        stringTree.reset();
        assertEquals(0, integerTree.size());
        assertEquals(0, stringTree.size());

        //Testing the size method of the integer tree and string tree after insert
        integerTree.insert(1);
        stringTree.insert("Australia");
        assertEquals(1, integerTree.size());

    }

    @Test
    void reset() {
        //Testing the reset method of the integer tree and string tree
        integerTree.insert(85);
        integerTree.reset();
        stringTree.reset();
        assertTrue(integerTree.isEmpty());
        assertTrue(stringTree.isEmpty());
    }

    @Test
    void incrementSize() {
        //Testing the incrementSize method of the integer tree and string tree
        integerTree.incrementSize();
        stringTree.incrementSize();
        assertEquals(32, integerTree.size());
        assertEquals(32, stringTree.size());
    }

    @Test
    void decrementSize() {
        //Testing the decrementSize method of the integer tree and string tree
        integerTree.decrementSize();
        stringTree.decrementSize();
        assertEquals(30, integerTree.size());
        assertEquals(30, stringTree.size());
    }

    @Test
    void contains() {
        //Testing the contains method of the integer tree and string tree
        assertTrue(integerTree.contains(75));
        assertTrue(stringTree.contains("China"));
        assertFalse(integerTree.contains(100));
        assertFalse(stringTree.contains("Australia"));

        //Testing the contains method of the integer tree and string tree after clear
        integerTree.reset();
        stringTree.reset();
        assertFalse(integerTree.contains(75));
        assertFalse(stringTree.contains("China"));

    }

    @Test
    void inOrder() {
        //Testing the inOrder method of the integer tree and string tree
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(0, List.of(3, 6, 9, 12, 15, 18, 21, 25, 27, 31, 34, 37, 40, 43, 48, 50, 53, 56, 60, 62, 68, 70, 75, 76, 81, 84, 87, 90, 93, 96, 99));
        assertEquals(integerList, integerTree.inOrder());

        //Testing the inOrder method of the integer tree and string tree after clear
        List<String> stringList = new ArrayList<>();
        stringList.addAll(0, List.of("Argentina", "Bangladesh", "Brazil", "China", "Colombia", "DR Congo", "Egypt", "Ethiopia", "France", "Germany", "India", "Indonesia", "Iran", "Italy", "Japan", "Kenya", "Mexico", "Myanmar", "Nigeria", "Pakistan", "Philippines", "Russia", "South Africa", "South Korea", "Spain", "Tanzania", "Thailand", "Turkey", "United Kingdom", "United States", "Vietnam"));
        assertEquals(stringList, stringTree.inOrder());

    }

    @Test
    void preOrder() {
        //Testing the preOrder method of the integer tree and string tree
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(0, List.of(75, 50, 12, 6, 3, 9, 25, 18, 15, 21, 37, 31, 27, 34, 43, 40, 48, 62, 56, 53, 60, 68, 70, 87, 81, 76, 84, 93, 90, 96, 99));
        assertEquals(integerList, integerTree.preOrder());

    }

    @Test
    void postOrder() {
        //Testing the postOrder method of the integer tree and string tree
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(0, List.of(3, 9, 6, 15, 21, 18, 27, 34, 31, 40, 48, 43, 37, 25, 12, 53, 60, 56, 70, 68, 62, 50, 76, 84, 81, 90, 99, 96, 93, 87, 75));
        assertEquals(integerList, integerTree.postOrder());
    }

    @Test
    void levelOrder() {
        //Testing the levelOrder method of the integer tree and string tree
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(0, List.of(75, 50, 87, 12, 62, 81, 93, 6, 25, 56, 68, 76, 84, 90, 96, 3, 9, 18, 37, 53, 60, 70, 99, 15, 21, 31, 43, 27, 34, 40, 48));
        assertEquals(integerList, integerTree.levelOrder());
    }

    @Test
    void height() {
        //Testing the height method of the integer tree and string tree
        assertEquals(6, integerTree.height());
        assertEquals(11, stringTree.height());

        //Testing the height method of the integer tree and string tree after clear
        integerTree.reset();
        stringTree.reset();
        assertEquals(-1, integerTree.height());
        assertEquals(-1, stringTree.height());

        //Testing the height method of the integer tree and string tree after insert
        integerTree.insert(1);
        stringTree.insert("Australia");
        assertEquals(0, integerTree.height());
        assertEquals(0, stringTree.height());
        integerTree.insert(2);
        stringTree.insert("Austria");
        assertEquals(1, integerTree.height());
        assertEquals(1, stringTree.height());

    }
}