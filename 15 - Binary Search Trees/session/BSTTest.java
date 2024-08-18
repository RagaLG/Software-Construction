package session;

public class BSTTest {
    public static void main(String[] args) {
        BinaryNode bst = new BinaryNode(9);
        bst.BinaryInsert(7);
        bst.BinaryInsert(8);
        bst.BinaryInsert(16);
        bst.BinaryInsert(2);
        bst.BinaryInsert(3);
        bst.BinaryInsert(10);

        Visitor visitor = new StringfyVisitor();
        bst.infixTraversal(visitor);
        System.out.println(visitor);
    }
}
