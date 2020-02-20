package warmup_tasks.lesson08;

import java.util.ArrayList;

public class geometricFigures {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        p1.x = 5;
        p2.y = 4;


        Figure f1 = new Circle(p1, 4);
        Figure f2=new Rectangle(p1,p2);
        Figure f3=new Triangle(p1,p2,p3);

        ArrayList<Figure> figure=new ArrayList<>();
        figure.add(f1);
        figure.add(f2);
        figure.add(f3);

        int total=0;
        for (Figure f:figure ) {
            total+=f.area();
        }

        System.out.printf("TOTAL: %d\n",total);


    }




}
