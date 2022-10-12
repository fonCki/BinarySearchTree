import java.util.ArrayList;

public class BinaryTree<T> {
    private BinaryTreeNode<T> root;

    private int height;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
        height = -1;
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
        height = -1;
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
        if (node == null)
            return false;
        if (element.equals(node.getElement())) {
            return true;
        } else {
            return contains(node.getLeftChild(), element) || contains(node.getRightChild(), element);
        }
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
     public int height() {
        if (height != -1)
            return height; //saved in a cache

        return height(root, -1); //Calculate new height
     }

    private int height(BinaryTreeNode node, int h) {
        if (node == null) {
            return h;
        } else {
            return Math.max(height(node.getLeftChild(), h +1), height(node.getRightChild(), h +1));
        }
    }

    public void heightHasChanged() {
        height = -1;
    }

}
