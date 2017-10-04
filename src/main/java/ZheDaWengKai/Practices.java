package ZheDaWengKai;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practices {
    public static void main (String[] args){
        System.out.println(1.2-1.1);
        System.out.println(new DecimalFormat("##.#").format(1.2-1.1));
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(new DecimalFormat("##.##").format(10.0/3));

        int n=10;
        System.out.println(n>=10);
        System.out.println(n>15);
    }
}
