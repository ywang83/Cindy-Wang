package Search;

import java.util.*;

import static java.lang.Integer.compare;

public class Compare {
    public static void main(String[] args) {
        int y1 = 0;
        int y2 = 0;
        int n;
        for (n = 0; n < 100; n+=10) {

            y1 = 100 * n + 10;
            y2 = 5 * n * n + 2;
            System.out.println("n=" + n + " , y1=" + y1);
            System.out.println("n=" + n + " , y2=" + y2);

            if(compare(y1, y2)>0){
                System.out.println("y1 > y2");
            }else if(compare(y1, y2)<0){
                System.out.println("y1 < y2");
            }else{
                System.out.println("y1 = y2");
            }
            System.out.println();
        }


    }
}
