import java.util.ArrayList;

public class BinaryTree<T> {
    private BinaryTreeNode<T> root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<T> node) {
        root = node;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void reset() {
        root = null;
        size = 0;
    }
    public void incrementSize() {
        size++;
    }

    public void decrementSize() {
        size--;
    }

    public boolean contains(T element) {
        return contains(root, element);
    }

    private boolean contains(BinaryTreeNode<T> node, T element) {

        return (root == null) ? false : root.getElement().equals(element) ||
                                        contains(root.getLeftChild(), element) ||
                                        contains(root.getRightChild(), element);
    }

    public ArrayList<T> inOrder() {
        ArrayList<T> list = new ArrayList<T>();
        inOrder(root, list);
        return list;
    }

    private void inOrder(BinaryTreeNode<T> node, ArrayList<T> list) {
        if (node != null) {
            inOrder(node.getLeftChild(), list);
            list.add(node.getElement());
            inOrder(node.getRightChild(), list);
        }
    }

}
