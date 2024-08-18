/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW15
The purpose of this assignment is to help us understand the concepts of Binary Tree and Binary Search Tree and implement them.
*/
package homework;

import java.util.Objects;

public class BinaryNode {
    private int value;
    private BinaryNode leftNode;
    private BinaryNode rightNode;
    
    public BinaryNode(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public BinaryNode getLeftNode() {
        return leftNode;
    }
    public void setLeftNode(BinaryNode leftNode) {
        this.leftNode = leftNode;
    }
    public BinaryNode getRightNode() {
        return rightNode;
    }
    public void setRightNode(BinaryNode rightNode) {
        this.rightNode = rightNode;
    }
    public void infixTraversal(Visitor visitor){
        if(leftNode != null){
            leftNode.infixTraversal(visitor);
        }
        visitor.visit(this);
        if(rightNode != null){
            rightNode.infixTraversal(visitor);
        }
    }

    public Boolean search(int target){
        if(target==this.value){
            return true;
        } else {
            Boolean found = false;
            if(leftNode != null){
                found = leftNode.search(target);
            }
            if(!found && rightNode != null){
                found = rightNode.search(target);
            }
            return found;
        }
    }

    public void BinaryInsert(int value){
        if(value < this.value){
            if(leftNode == null){
                this.leftNode = new BinaryNode(value);
            } else {
                leftNode.BinaryInsert(value);
            }
        } else {
            if(rightNode == null){
                this.rightNode = new BinaryNode(value);
            } else {
                rightNode.BinaryInsert(value);
            }
        }
    }

    public boolean BinarySearch(int target){
        if(target==value){
            return true;
        } else {
            if(target < value){
                return (leftNode != null && leftNode.BinarySearch(target));
            } else {
                return (rightNode != null && rightNode.BinarySearch(target));
            }
        }
    }
    /**
     * Calculates the height of the tree rooted at this node.
     *
     * @return The height of the tree.
     */
    public int height(){
        return Math.max(getHeight(leftNode), getHeight(rightNode));
    }
    /**
     * Recursive helper method to calculate the height of a specific node in the tree.
     *
     * @param node The node for which to calculate the height.
     * @return The height of the node.
     */
    public int getHeight(BinaryNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(node.leftNode), getHeight(node.rightNode));
        }
    }
    /**
     * Checks if the tree rooted at this node is perfect.
     * Perfect tree has 2^(height+1) -1 nodes.
     * @return True if the tree is perfect, false otherwise.
     */
    public boolean isPerfect() {
        int height = height();
        int nodeCount = countNodes();

        return nodeCount == (int) Math.pow(2, height + 1) - 1;
    }
    /**
     * Recursive helper method to count the number of nodes in the tree rooted at this node.
     *
     * @return The number of nodes in the tree.
     */
    private int countNodes() {
        if (this == null) {
            return 0;
        } else {
            return 1 + (leftNode != null ? leftNode.countNodes() : 0) + (rightNode != null ? rightNode.countNodes() : 0);
        }
    }
    /**
     * Calculates the number of leaf nodes in the tree rooted at this node.
     *
     * @return The number of leaf nodes.
     */
    public int leaves() {
        if (this == null) {
            return 0;
        } else if (leftNode == null && rightNode == null) {
            return 1; // Current node is a leaf
        } else {
            return (leftNode != null ? leftNode.leaves() : 0) + (rightNode != null ? rightNode.leaves() : 0);
        }
    }
    /**
     * Checks if the given tree is equal to the tree calling the method.
     * Two trees are known to be equal if they contain the same elements in the same order.
     * @param obj The tree to compare.
     * @return True if the trees are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        BinaryNode other = (BinaryNode) obj;

        return this.value == other.value &&
                Objects.equals(this.leftNode, other.leftNode) &&
                Objects.equals(this.rightNode, other.rightNode);
    }

    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(2);
        BinaryNode left = new BinaryNode(3);
        BinaryNode right = new BinaryNode(7);

        BinaryNode ll = new BinaryNode(9);
        BinaryNode lr = new BinaryNode(4);
        BinaryNode rl = new BinaryNode(1);
        BinaryNode rr = new BinaryNode(6);

        root.setLeftNode(left);
        root.setRightNode(right);
        left.setLeftNode(ll);
        left.setRightNode(lr);
        right.setLeftNode(rl);
        right.setRightNode(rr);

        Visitor visitor = new StringfyVisitor();
        root.infixTraversal(visitor);

        System.out.println("The tree: " + visitor);

        System.out.println("Check the value 11: " + root.search(11));
        System.out.println("Check the value 9: " + root.search(9));
    }    
}
// end of class BinaryNode