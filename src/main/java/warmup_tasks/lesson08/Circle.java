package warmup_tasks.lesson08;

public class Circle extends Figure {
    Point center;
    int radius;


    public Circle(Point p1,int radius) {
        this.center = p1;
        this.radius=radius;
    }


    @Override
    public int area() {
        int s;
        s= (int) (Math.PI*Math.pow(radius,2));
        return s;
    }


}
