package session;

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
