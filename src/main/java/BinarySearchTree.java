
import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {


    public boolean insert(T element) {
        if (getRoot() != null)
            return insert(getRoot(), element);
        setRoot(new BinarySearchTreeNode<T>(element));
        incrementSize();
        heightHasChanged();
        return true;
    }

    private boolean insert(BinaryTreeNode<T> node, T element) {
        if (node.getElement().compareTo(element) == 0) {
            return false;
        } else if (node.getElement().compareTo(element) > 0) {
            if (node.getLeftChild() == null) {
                node.addLeftChild(new BinarySearchTreeNode<T>(element));
                incrementSize();
                heightHasChanged();
                return true;
            } else {
                return insert(node.getLeftChild(), element);
            }
        } else {
            if (node.getRightChild() == null) {
                node.addRightChild(new BinarySearchTreeNode<T>(element));
                incrementSize();
                heightHasChanged();
                return true;
            } else {
                return insert(node.getRightChild(), element);
            }
        }
    }

    public boolean removeElement(T element) {
        if (getRoot() == null)
            return false;
        if (getRoot().getElement().compareTo(element) == 0) { // is the root
            if (getRoot().getLeftChild() == null && getRoot().getRightChild() == null) {//only element in the tree
                reset();
                return true;
            }
            if (getRoot().getRightChild() == null) { //root has only left child
                setRoot(getRoot().getLeftChild());
                decrementSize();
                heightHasChanged();
                return true;
            }
            if (getRoot().getLeftChild() == null) { //root has only right child
                setRoot(getRoot().getRightChild());
                decrementSize();
                heightHasChanged();
                return true;
            }
            //TODO
            T min = findMin((BinaryTreeNode<T>)getRoot().getRightChild());
            BinaryTreeNode<T> replacement = getNode(getRoot().getRightChild(), min);
            removeElement(replacement.getElement());
            getRoot().setElement(replacement.getElement());
            return true;
            //root has two children
        }
        return removeElement(getParent(getRoot(), element), element); //if is not the root
    }

    private BinaryTreeNode<T> getParent(BinaryTreeNode<T> parent, T element) {
        if (parent == null)
            return null;
        if ((parent.getLeftChild() != null) && ((T)parent.getLeftChild().getElement()).compareTo(element) == 0) {
                return parent;
        }
        if ((parent.getRightChild() != null) && ((T)parent.getRightChild().getElement()).compareTo(element) == 0) {
                return parent;
        }
        if (parent.getElement().compareTo(element) > 0) {
            return getParent(parent.getLeftChild(), element);
        } else {
            return getParent(parent.getRightChild(), element);
        }
    }

    private boolean removeElement(BinaryTreeNode<T> parent, T element) {
        if (parent == null)
            return false;
        if (parent.getLeftChild() != null && ((T) parent.getLeftChild().getElement()).compareTo(element) == 0) {
            return removeChild(parent, parent.getLeftChild());
        } else if (parent.getRightChild() != null && ((T) parent.getRightChild().getElement()).compareTo(element) == 0) {
            return removeChild(parent, parent.getRightChild());
        }
        return false;
    }

    private boolean removeChild(BinaryTreeNode<T> parent, BinaryTreeNode<T> child) {
        if (child.getLeftChild() == null && child.getRightChild() == null) { //child is a leaf
            if (parent.getLeftChild() == child) {
                parent.addLeftChild(null);
            } else {
                parent.addRightChild(null);
            }
            decrementSize();
            heightHasChanged();
            return true;
        }
        if (child.getLeftChild() == null) { //child has only right child
            if (parent.getLeftChild() == child) {
                parent.addLeftChild(child.getRightChild());
            } else {
                parent.addRightChild(child.getRightChild());
            }
            decrementSize();
            heightHasChanged();
            return true;
        }
        if (child.getRightChild() == null) { //child has only left child
            if (parent.getLeftChild() == child) {
                parent.addLeftChild(child.getLeftChild());
            } else {
                parent.addRightChild(child.getLeftChild());
            }
            decrementSize();
            heightHasChanged();
            return true;
        }
        //TODO
        //child has two children

        T min = findMin((BinaryTreeNode<T>)child.getRightChild());
        BinaryTreeNode<T> replacement = getNode(child.getRightChild(), min);
        removeElement(replacement.getElement());
        child.setElement(replacement.getElement());
        return true;
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


    @Override
    public boolean contains(T element) {
        return getNode(getRoot(), element) != null;
    }

    private BinaryTreeNode<T> getNode(BinaryTreeNode<T> node, T element) {
        if (node == null)
            return null;
        if (element.equals(node.getElement())) {
            return node;
        } else {
            if (node.getElement().compareTo(element) > 0) {
                return getNode(node.getLeftChild(), element);
            } else {
                return getNode(node.getRightChild(), element);
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