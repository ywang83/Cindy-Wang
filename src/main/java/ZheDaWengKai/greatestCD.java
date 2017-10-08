package ZheDaWengKai;

import java.util.Scanner;

public class greatestCD {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int oa=a; //original a
        int ob=b; // original b
        while (b!=0){
            int r=a%b;
            System.out.println(a +"," + b+"," +r);
            a=b;
            b=r;

//            a=b; // Why doesn't it work?
//            b=a%b;
        }
        System.out.println("The Greatest Common Divisor of "+ oa +" and " + ob + " is "+a);
    }
}
