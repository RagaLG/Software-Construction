/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW15
The purpose of this assignment is to help us understand the concepts of Binary Tree and Binary Search Tree and implement them.
*/
package homework;

public class BinaryNodeHeight {
    /**
     * Main method to test the height() method in BinaryNode.java
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
    
    BinaryNode root3 = new BinaryNode(1);
    root3.BinaryInsert(2);
    root3.BinaryInsert(3);
    root3.BinaryInsert(4);
    root3.BinaryInsert(5);

    Visitor visitor = new StringfyVisitor();
    Visitor visitor2 = new StringfyVisitor();
    Visitor visitor3 = new StringfyVisitor();
    root.infixTraversal(visitor);
    System.out.println(visitor);
    System.out.println("Height of tree 1: " + root.height());
    root2.infixTraversal(visitor2);
    System.out.println(visitor2);
    System.out.println("Height of tree 2: " + root2.height());
    root3.infixTraversal(visitor3);
    System.out.println(visitor3);
    System.out.println("Height of tree 3: " + root3.height());
    
    }
}
// end of class BinaryNodeHeight
