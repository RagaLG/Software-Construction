/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW15
The purpose of this assignment is to help us understand the concepts of Binary Tree and Binary Search Tree and implement them.
*/
package homework;

public class BinaryNodeLeaf {
    /**
     * Main method to test the leaves() method in BinaryNode.java
     * @param args
     */
    public static void main(String[] args) {
    BinaryNode root = new BinaryNode(2);
    root.BinaryInsert(3);
    root.BinaryInsert(7);
    root.BinaryInsert(9);
    root.BinaryInsert(4);
    root.BinaryInsert(1);
    root.BinaryInsert(6);

    BinaryNode root2 = new BinaryNode(5);
    root2.BinaryInsert(2);
    root2.BinaryInsert(1);
    root2.BinaryInsert(3);
    root2.BinaryInsert(7);
    root2.BinaryInsert(6);
    root2.BinaryInsert(9);

    System.out.println("Number of leaves in Tree 1: " + root.leaves());
    System.out.println("Number of leaves in Tree 2: " + root2.leaves());
    }

}
// end of class BinaryNodeLeaf
