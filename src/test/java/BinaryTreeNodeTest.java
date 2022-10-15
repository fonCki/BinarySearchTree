import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNodeTest {

    private BinaryTreeNode<Integer> node;

    @BeforeEach
    void setUp() {
        node = new BinaryTreeNode<>(105);
    }

    @Test
    void getElement() {
        assertEquals(105, node.getElement());
    }

    @Test
    void setElement() {
        node.setElement(100);
        assertEquals(100, node.getElement());
    }

    @Test
    void addAndGetLeftChild() {
        BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(10);
        node.addLeftChild(leftChild);
        assertEquals(leftChild, node.getLeftChild());
    }

    @Test
    void addAndGetRightChild() {
        BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(20);
        node.addRightChild(rightChild);
        assertEquals(rightChild, node.getRightChild());
    }
    
}