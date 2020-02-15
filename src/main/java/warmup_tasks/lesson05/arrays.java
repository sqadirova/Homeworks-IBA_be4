package warmup_tasks.lesson05;

public class arrays {

    public static void main(String[] args) {
        int MAX = 10;
        //declare
        int[] odd = new int[MAX];     //tek
        int[] even = new int[MAX];    //cut
        int combLen = odd.length + even.length;
        int[] combine = new int[combLen];

        //fill odd
        for (int i = 0; i < odd.length; i++) {
            int rd_num = (int) (Math.random() * (MAX + 1));
            if (!(rd_num % 2 == 0)) {
                odd[i] = rd_num;
            }
        }
        //fill even
        for (int j = 0; j < even.length; j++) {
            int rd_num = (int) (Math.random() * (MAX + 1));
            if (rd_num % 2 == 0) {
                even[j] = rd_num;
            }
        }

        //odd={1,2,3,4,5,6,7,8,9,10}
        //even={10,9,8,7,6,5,4,3,2,1}
        //combine={1,10,2,9,3,8,4,7,5,6,6,5,7,4,8,3,9,2,10,1}

        //comb-0=odd-0
        //comb-1=even-0
        //comb-2=odd-1
        //comb-3=even-1
        //comb-4=odd2
        //comb-5=even-2

        int n=0;
        for (int k = 0; k <combine.length ; k=k+2) {
                combine[k]=odd[n];
                n++;

        }
        int a=0;
        for (int k = 1; k <combine.length ; k=k+2) {
            combine[k]=even[a];
            a++;

        }

        System.out.print("Odd:");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i]+"\t");
        }
        System.out.println();

        System.out.print("Even:");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i]+"\t");
        }
        System.out.println();

        //print combine
        for(int m = 0; m < combine.length; m++) {
            System.out.print(combine[m]+"\t");
        }
    }



    }

