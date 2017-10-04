package ZheDaWengKai;

import java.util.Scanner;

public class primeNumber {
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int isPrime = 1;

        for(int i=2; i<n; i++){
            if (n % i == 0){
                System.out.println(n + " is NOT a prime number.");
                break;
            }
            else {
                System.out.println(n + " is a prime number.");
                break;
            }
        }


//        for(int i=2; i<n; i++) {
//            if (n % i == 0) {
//                isPrime = 0;
//            }
//        }
//        if (isPrime ==1) {
//            System.out.println(n + " is a prime number.");
//        }
//        else
//            System.out.println(n + " is not a prime number.");

    }
}
