public class BinarySearchTreeNode <T extends Comparable<T>> extends BinaryTreeNode {

    private T element;

    public BinarySearchTreeNode() {
    }

    public BinarySearchTreeNode(Object element, T element1) {
        super(element);
        this.element = element1;
    }

    public BinarySearchTreeNode(Object element) {
        super(element);
    }
}
