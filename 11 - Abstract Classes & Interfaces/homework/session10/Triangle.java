package session10;

/**
 * An equilateral triangle shape.
 */
public class Triangle extends Shape{
    /**
     * Used to compute the area of an equilateral triangle.
     */
    private static final double CONSTANT = Math.sqrt(3) / 4.0d;

    /**
     * The length of one side of the triangle.
     */
    private double side;

    /**
     * Creates a new equilateral triangle.
     *
     * @param pos The position of the top left corner.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     * @param side The length of one side of the triangle.
     */
    public Triangle(Position pos, String fillColor, String lineColor,
                    double side) {
        super(pos, fillColor, lineColor);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    /**
     * Computes and returns the area of the equilateral triangle.
     *
     * @return Returns the area of the equilateral triangle.
     */
    @Override
    public double getArea() {
        return CONSTANT * side * side;
    }

    /**
     * Computes and returns the perimeter of the equilateral triangle.
     *
     * @return Returns the perimeter of the equilateral triangle.
     */
    @Override
    public double getPerimeter() {
        return side * 3;
    }
    /**
     * Scales the size of a Triangle by multiplying its side length by the specified factor.
     * 
     * @param factor The scaling factor.
     */
    @Override
    public void scale(double factor) {
        this.side *= factor;
    }
}
