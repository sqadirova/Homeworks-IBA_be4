package warmup_tasks.lesson05;

public class circleArrayofNumbers {
    public static void main(String[] args) {
        int WIDTH=10;
        int HEIGHT=10;
        int[][] array=new int[WIDTH][HEIGHT];

        for (int row = 0; row < WIDTH; row++) {
            for (int col = 0; col < HEIGHT; col++) {
                if (row==0 || row==WIDTH-1 || col==0 ||col== HEIGHT-1) {
                    System.out.print("1");
                }else if (row==1 || row==WIDTH-2 || col==1 || col==HEIGHT-2){
                    System.out.print("2");
                }
                else if (row==2 || row==WIDTH-3 || col==2 || col==HEIGHT-3) {
                    System.out.print("3");
                }
                else  if (row==3 || row==WIDTH-4 || col==3 || col==HEIGHT-4)   {
                    System.out.print("4");
                }
                else if (row==4 || row==WIDTH-5 || col==4 || col==HEIGHT-5) {
                    System.out.print("5");
                }
            }
            System.out.println();
        }














    }
}
