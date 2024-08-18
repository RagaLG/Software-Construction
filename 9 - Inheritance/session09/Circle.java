package session09;

public class Circle extends Shapes {
    double radius;

    public Circle(Position p, String outlineColor, String fillColor, double radius) {
        super(p, outlineColor, fillColor);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
    @Override
    public String toString() {
        return "Circle" +"\n"+
                "radius=" + this.radius +
                ", x=" + p.getX() +
                ", y=" + p.getY() +
                ", color='" + fillColor + '\'' +
                ", outlinecolor='" + outlineColor + '\'';
    }
}
class main_circle{
    public static void main(String[] args){
        Position p = new Position(3,8);

        Circle c1= new Circle(p,"red","blue",3.5);
        System.out.println(c1);
        System.out.println("Area="+c1.getArea());
        System.out.println("Perimeter="+c1.getPerimeter());

    }
}
