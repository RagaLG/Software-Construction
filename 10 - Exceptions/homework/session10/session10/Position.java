package session10;

/**
 * An x,y coordinate.
 */
public class Position {
    /**
     * The x coordinate.
     */
    private double x;

    /**
     * The y coordinate.
     */
    private double y;

    /**
     * Creates a new position.
     *
     * @param x The x coordinate of the new position.
     * @param y The y coordinate of the new position.
     */
    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
