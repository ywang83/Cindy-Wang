package ZheDaWengKai;

import java.util.Scanner;

public class NumberDigit {
    public static void main (String[] args){
        System.out.print("Please input a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number = n;
        int count=0;
//        while (n>0){
//            n = n/10;
//            count=count+1;
//            System.out.println("n = " + n + ";" + " count = " + count + ".");
//        }
        do {
            n = n/10;
            count=count+1;
            System.out.println("n = " + n + ";" + " count = " + count + ".");
        } while (n>0);
        System.out.println("There are " + count + " digits in " + number + ".");
        System.out.println("There are " + count + " digits in " + n + ".");
    }
}
