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
    void insert() {
        //insert 3 new integers to the integer tree
        integerTree.insert(100);
        integerTree.insert(200);
        integerTree.insert(300);

        //check if the new integers are inserted correctly
        assertTrue(integerTree.contains(100));
        assertTrue(integerTree.contains(200));
        assertTrue(integerTree.contains(300));
        assertEquals(34, integerTree.size());

        //insert 3 repeated strings to the string tree
        stringTree.insert("China");
        stringTree.insert("India");
        stringTree.insert("United States");
        assertEquals(31, stringTree.size());
    }

    @Test
    void removeElement() {
        //remove 3 integers from the integer tree
        integerTree.removeElement(75);
        integerTree.removeElement(50);
        integerTree.removeElement(12);

        //check if the integers are removed correctly
        assertFalse(integerTree.contains(75));
        assertFalse(integerTree.contains(50));
        assertFalse(integerTree.contains(12));
        assertEquals(27, integerTree.size());

        //remove 3 strings from the string tree
        stringTree.removeElement("China");
        stringTree.removeElement("India");
        stringTree.removeElement("United States");
        assertEquals(27, stringTree.size());

        //remove a leaf node in the string tree
        stringTree.removeElement("Argentina");
        assertEquals(26, stringTree.size());

        //remove a node with one child in the string tree
        stringTree.removeElement("France");
        assertEquals(25, stringTree.size());

        //remove a node with two children in the string tree
        stringTree.removeElement("Ethiopia");
        assertEquals(24, stringTree.size());

        //remove the root node in the string tree
        stringTree.removeElement("Bangladesh");
        assertEquals(23, stringTree.size());
    }
    @Test
    void findMin() {
        //find the minimum integer in the integer tree
        assertEquals(3, integerTree.findMin());

        //find the minimum string in the string tree
        assertEquals("Argentina", stringTree.findMin());
    }

    @Test
    void findMax() {
        //find the maximum integer in the integer tree
        assertEquals(99, integerTree.findMax());

        //find the maximum string in the string tree
        assertEquals("Vietnam", stringTree.findMax());
    }

    @Test
    void contains() {
        //check if the integer tree contains 3 integers
        assertTrue(integerTree.contains(75));
        assertTrue(integerTree.contains(50));
        assertTrue(integerTree.contains(12));

        //check if the string tree contains 3 strings
        assertTrue(stringTree.contains("China"));
        assertTrue(stringTree.contains("India"));
        assertTrue(stringTree.contains("United States"));
    }

    @Test
    void rebalance() {
        //If there are n nodes in a binary search tree, maximum height of the binary search tree is n-1,
        // and minimum height is ceil(log2(n+1))-1.
        //So the height of the integer tree is 31, and the height of the string tree is 30.
        assertEquals(6, integerTree.height());
        assertEquals(11, stringTree.height());

        //rebalance the integer tree
        integerTree.rebalance();
        int estimatedHeight = (int) Math.ceil(Math.log(integerTree.size() + 1) / Math.log(2)) - 1;
        assertEquals(estimatedHeight, integerTree.height());

        //rebalance the string tree
        stringTree.rebalance();
        estimatedHeight = (int) Math.ceil(Math.log(stringTree.size() + 1) / Math.log(2)) - 1;
        assertEquals(estimatedHeight, stringTree.height());

    }
}