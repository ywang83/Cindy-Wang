package ZheDaWengKai;

import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int cd=1; //cd=Common Divisor
        //int gcd =1; //gcd=Greatest Common Divisor

        for (int i=2; i<=n1 && i<=n2; i++){
            if (n1%i==0 && n2%i==0){
                cd=i;
//                System.out.println(cd);
            }
        }
//        if (cd>gcd){
//            gcd = cd;
//        }
        System.out.println("The Greatest Common Divisor is "+cd);
    }
}
