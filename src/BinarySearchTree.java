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

    public boolean removeElement(T Element) {
        return true;
    }
}