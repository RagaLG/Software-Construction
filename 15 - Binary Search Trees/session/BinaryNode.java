package session;

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