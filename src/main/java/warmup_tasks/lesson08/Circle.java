package warmup_tasks.lesson08;

public class Circle extends Figure {
    Point p1;
    int radius;


    public Circle(Point p1,int radius) {
        this.p1 = p1;
        this.radius=radius;
    }

//    @Override
//    public int area(Point center,Point radius) {
//
//    }

    @Override
    public int area() {
        int s;
        s=p1.x*radius;
        return s;
    }


}
