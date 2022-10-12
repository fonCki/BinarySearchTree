import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

        for (int i = 0; i < 100; i++) {
            tree.insert(new Random().nextInt(200));
        }

        System.out.println("size equals" + tree.size());




        ArrayList<Integer> list = tree.inOrder();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        new BinaryTreePrint().printTree(tree.getRoot());

        tree.rebalance();

        new BinaryTreePrint().printTree(tree.getRoot());

        System.out.println(" \nminimum is: " + tree.findMin());

        System.out.println(tree.contains(199));

        System.out.println(tree.findMax());
    }
}