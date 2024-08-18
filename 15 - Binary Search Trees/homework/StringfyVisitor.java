/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW15
The purpose of this assignment is to help us understand the concepts of Binary Tree and Binary Search Tree and implement them.
*/
package homework;

public class StringfyVisitor implements Visitor{
    
    StringBuilder builder;

    public StringfyVisitor() {
        this.builder = new StringBuilder();;
    }

    @Override
    public void visit(BinaryNode node) {
        this.builder.append(node.getValue());
        this.builder.append(" ");
    }

    @Override
    public String toString(){
        return builder.toString();
    }
}
// end of class StringfyVisitor
