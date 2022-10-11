import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

        tree.insert(72);
        tree.insert(52);
        tree.insert(61);
        tree.insert(61);
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);

        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        tree.insert(32);

        tree.insert(23);
        tree.insert(44);

        tree.insert(84);
        tree.insert(12);

        System.out.println("size equals" + tree.size());


        ArrayList<Integer> list = tree.inOrder();


        new BinaryTreePrint().printTree(tree.getRoot());
    }
}