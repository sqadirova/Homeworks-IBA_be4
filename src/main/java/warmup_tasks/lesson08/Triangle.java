package warmup_tasks.lesson08;

public class Triangle extends Figure {
    Point p1;
    Point p2;
    Point p3;


    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int area() {
        int s;
        s=(p1.x*p2.y)/2;
        return s;
    }
}
