public class BinaryTreeNode<T> {
    private T element;
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }


    public void setElement(T element) {
        this.element = element;
    }

    public void addLeftChild(BinaryTreeNode node) {
        leftChild = node;
    }

    public void addRightChild(BinaryTreeNode node) {
        rightChild = node;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

}