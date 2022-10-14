
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static BinarySearchTree<Integer> tree;
    public static void main(String[] args) {

        tree = new BinarySearchTree<Integer>();

//        for (int i = 0; i < 50; i++) {
//            tree.insert(new Random().nextInt(99));
//        }
//
//        doTHings();
//
//        tree.rebalance();
//
//        doTHings();
//
//        tree.removeElement(59);
//
//        doTHings();

//        tree.insert(5);
        tree.insert(10);

        tree.insert(5);
//        tree.insert(4);
        tree.insert(7);
        tree.insert(8);

        new BinaryTreePrint().printTree(tree.getRoot());

        System.out.println();

        System.out.println(tree.inOrder());

        tree.removeElement(7);

        System.out.println(tree.inOrder());

        System.out.println("size is: " + tree.size());

        new BinaryTreePrint().printTree(tree.getRoot());
    }

    static void doTHings() {
        System.out.println("size equals" + tree.size());


//
        ArrayList<Integer> list = tree.inOrder();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " - ");
        }
        System.out.println();

        list = tree.preOrder();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " - ");
        }
        System.out.println();

        list = tree.postOrder();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " - ");
        }
        System.out.println();

        list = tree.levelOrder();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " - ");
        }
        System.out.println();


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

        System.out.println("Exist: " + tree.contains(50));


        System.out.println("***********************************************");
    }
}