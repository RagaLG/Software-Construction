package session10;

/**
 * A rectangle shape.
 */
public class Rectangle extends Shape {
    /**
     * The width of the rectangle.
     */
    private double width;

    /**
     * The height of the rectangle.
     */
    private double height;


    /**
     * Creates a new rectangle.
     *
     * @param pos The position of the top left corner.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(Position pos, String fillColor, String lineColor,
                     double width, double height) {
        super(pos, fillColor, lineColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    /**
    * Sets the width of the shape to a new value.
    *
    * @param width The new width value to set. Must be a non-negative value.
    * @throws NegativeCheckedException If the new width is negative, this exception is thrown.
    */
    public void setWidth(double width) throws NegativeCheckedException {
        if(width < 0){
                throw new NegativeCheckedException("Width can't have negative values."); 
            }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    /**
    * Sets the height of the shape to a new value.
    *
    * @param height The new height value to set. Must be a non-negative value.
    * @throws NegativeCheckedException If the new height is negative, this exception is thrown.
    */
    public void setHeight(double height) throws NegativeCheckedException {
        if(width < 0){
                throw new NegativeCheckedException("Height can't have negative values."); 
            }
        this.height = height;
    }

    /**
     * Computes and returns the area of the rectangle.
     *
     * @return Returns the area of the rectangle.
     */
    @Override
    public double area() {
        return width * height;
    }

    /**
     * Computes and returns the perimeter of the rectangle.
     *
     * @return Returns the perimeter of the rectangle.
     */
    @Override
    public double perimeter() {
        return width*2 + height*2;
    }
}
