package warmup_tasks.lesson08;

public class Rectangle extends Figure {
    Point p1;
    Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

    }

    @Override
    public int area() {
        int s;
        s=p1.x*p2.y;
        return s;
    }
}
