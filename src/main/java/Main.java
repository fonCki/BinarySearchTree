
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

        for (int i = 0; i < 1; i++) {
            tree.insert(new Random().nextInt(999));
        }

        System.out.println("size equals" + tree.size());



//
        ArrayList<Integer> list = tree.inOrder();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        new BinaryTreePrint().printTree(tree.getRoot());

//        tree.rebalance();

//        new BinaryTreePrint().printTree(tree.getRoot());
//
        System.out.println(" \nminimum is: " + tree.findMin());
//
//        System.out.println(tree.contains(199));


        //testing efficiency
        long startTime = System.nanoTime();
        System.out.println(tree.contains(50));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("takes a total of " + duration);

        System.out.println("total height is " + tree.height());

        System.out.println("total height is " + tree.height());



    }
}