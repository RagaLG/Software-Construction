/* 
Class: SWEN-601 [Software Construction]
Name: Raga Lagudua Ganesan
Email: rl1158@g.rit.edu
Assignment: HW11
The purpose of this assignment is to help us learn to implement Abstract Classes, 
Abstract Methods and Interfaces.
*/
package session;

public interface Figure {
    public Position getPos();
    public void move(Position pos);
    public String getFillColor();
    public String getLineColor();
    public double getArea();
    public double getPerimeter();
    public void scale(double factor);
}
// end of Interface Figure
