package session09;

public class Shapes {
    Position p;
    String fillColor;
    String outlineColor;

    public Shapes (Position p, String fillColor, String outlineColor){
        this.p = p;
        this.fillColor = fillColor;
        this.outlineColor = outlineColor;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public void move(double x, double y){
        this.p.setX(x);
        this.p.setY(y);
    }
}
