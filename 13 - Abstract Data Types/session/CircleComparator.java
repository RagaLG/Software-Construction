package session;
import java.util.Comparator;
import java.io.Serializable;
public class CircleComparator implements Comparator<session.Circle>, Serializable{
    public static void main(String[] args){
        session.Circle c1 = new Circle(new session.Position(0,0), "Red", "Yellow", 9.4);
        session.Circle c2 = new Circle(new session.Position(0,0), "Green", "Gray", 7.6);
        CircleComparator comparator = new CircleComparator();
        System.out.println(comparator.compare(c1,c2));
    }
    @Override
    public int compare(session.Circle c1, session.Circle c2){
        return (int)Math.signum(c1.area() - c2.area());
    }
}
