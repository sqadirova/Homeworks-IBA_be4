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
        return Math.abs(p1.x-p2.x)*Math.abs(p2.y-p2.y);
    }
}
