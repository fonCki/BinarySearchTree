import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
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
    }

    @Test
    void decrementSize() {
    }

    @Test
    void contains() {
    }

    @Test
    void inOrder() {
    }

    @Test
    void insert() {
    }

    @Test
    void findMin() {
    }

    @Test
    void findMax() {
    }

    @Test
    void contains2() {
    }

    @Test
    void rebalance() {
    }
}