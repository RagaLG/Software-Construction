package session10;

/**
 * A circle shape.
 */
public class Circle extends Shape {
    /**
     * The radius of the circle.
     */
    private double radius;

    /**
     * Creates a new circle.
     *
     * @param pos The position of the top left corner.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     * @param radius The radius of the circle.
     */
    public Circle(Position pos, String fillColor, String lineColor,
                  double radius) {
        super(pos, fillColor, lineColor);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    /**
     * Computes and returns the area of the circle.
     *
     * @return Returns the area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Computes and returns the perimeter of the circle.
     *
     * @return Returns the perimeter of the circle.
     */
    @Override
    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }
    /**
     * Scales the size of a Circle by multiplying its radius by the specified factor.
     *
     * @param factor The scaling factor.
     */
    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }
}
