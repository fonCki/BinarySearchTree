
import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {


    public boolean insert(T element) {
        if (getRoot() != null)
            return insert(getRoot(), element);
        setRoot(new BinarySearchTreeNode<T>(element));
        incrementSize();
        return true;
    }

    private boolean insert(BinaryTreeNode<T> node, T element) {
        if (node.getElement().compareTo(element) == 0) {
            return false;
        } else if (node.getElement().compareTo(element) > 0) {
            if (node.getLeftChild() == null) {
                node.addLeftChild(new BinarySearchTreeNode<T>(element));
                incrementSize();
                return true;
            } else {
                return insert(node.getLeftChild(), element);
            }
        } else {
            if (node.getRightChild() == null) {
                node.addRightChild(new BinarySearchTreeNode<T>(element));
                incrementSize();
                return true;
            } else {
                return insert(node.getRightChild(), element);
            }
        }
    }


    public T findMin() {
        return getRoot() == null ? null : findMin(getRoot());
    }

    private T findMin(BinaryTreeNode<T> node) {
        return (node.getLeftChild() == null) ? node.getElement() : (T) findMin(node.getLeftChild());
    }

    public T findMax() {
            return getRoot() == null ? null : findMax(getRoot());
    }

    private T findMax(BinaryTreeNode<T> node) {
        return (node.getRightChild() == null) ? node.getElement() : (T) findMax(node.getRightChild());
    }




    public boolean contains2(T element) {
        return contains(getRoot(), element);
    }

    private boolean contains(BinaryTreeNode<T> node, T element) {
        if (node == null)
            return false;
        if (element.equals(node.getElement())) {
            return true;
        } else {
            if (node.getElement().compareTo(element) > 0) {
                return contains(node.getLeftChild(), element);
            } else {
                return contains(node.getRightChild(), element);
            }

        }

    }

    public void rebalance() {
        ArrayList<T> list = inOrder();
        reset();
        rebalance(list, 0, list.size() - 1);
    }

    private void rebalance(ArrayList<T> list, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            insert(list.get(mid));
            rebalance(list, start, mid - 1);
            rebalance(list, mid + 1, end);
        }
    }

}