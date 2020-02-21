package warmup_tasks.lesson08;

import javax.swing.text.Utilities;
import java.util.ArrayList;

public class geometricFigures {
    public void generateRandom(){
        int r= (int) (Math.random()*10);

    }

    public static void main(String[] args) {

       /* Point p1 = new Point(5,4);
        Point p2 = new Point(5,4);
        Point p3 = new Point(5,4);
        Figure f3=new Triangle(p1,p2,p3);
*/
        ArrayList<Figure> figures=new ArrayList<>();
        figures.add(new Circle(new Point(1,2),3));
        figures.add(new Rectangle(new Point(1,2),new Point(2,3)));
        figures.add(new Triangle(new Point(1,2),new Point(3,4),new Point(2,5)));
//        figures.add(f3);

        int total=0;
        for (Figure f:figures ) {
            total+=f.area();
        }

        System.out.printf("TOTAL: %d\n",total);


    }




}
