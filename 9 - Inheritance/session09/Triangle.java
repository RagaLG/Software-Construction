package session09;

public class Triangle extends Shapes {
    double sideLength;

    public Triangle(Position p, double sideLength, String fillColor, String lineColor){
        super(p,fillColor,lineColor);
        this.sideLength = sideLength;

    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)/4) * Math.pow(sideLength,2);
    }

    @Override
    public double getPerimeter() {
        return 3 * sideLength;
    }

    @Override
    public String toString(){
        return "Triangle at: " + super.toString()+"\n Side length: "+sideLength;
    }
}
