package session09;

public class ShapeMover {
    
    public static void moveShape(Shapes shape, Position pos){
        System.out.println(shape);
        shape.move(pos.getX(), pos.getY());
        System.out.println(shape);
    }
    public static void main(String[] args){
        Position p = new Position(2,3);
        Shapes c1 = new Circle(p,"red", "red",3.14);
        Circle c2 = new Circle(p,"green","blue",3.7);
        Rectangle r1= new Rectangle(p,3.4,5.6,"blue","red");
        Triangle t1 = new Triangle(p,3,"yellow","orange");


        moveShape(t1, new Position(7,9));

        moveShape(c1,new Position(3,4));
        moveShape(c2,new Position(9,9));
        moveShape(r1,new Position(5,7));
    }
}
