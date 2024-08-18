package session09;

public class Rectangle extends Shapes {
    double height;
    double width;
    public Rectangle(Position p, double height, double width, String fillColor, String outlineColor){
        super(p, fillColor, outlineColor);
        this.height = height;
        this.width = width;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (2*this.height + 2*this.width);
    }
    public String toString() {
        return "x=" + p.getX() +
                ", y=" + p.getY() +
                ", fillColor='" + fillColor + '\'' +
                ", lineColor='" + outlineColor + '\'';
    }

    public static void main(String[] args){
        Position p = new Position(4,9);

        Rectangle r1= new Rectangle(p,3.4,5.6,"blue","red");
        System.out.println(r1);
        System.out.println("Area="+r1.getArea());
        System.out.println("Perimeter="+r1.getPerimeter());

    }
}
