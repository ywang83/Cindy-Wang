package ZheDaWengKai;

import java.util.Scanner;

public class sumInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter how many numbers you want to input: ");
        int n = s.nextInt();
        int sum = 0;
            for (int i = 1; i <= n; i++){
                System.out.print("Please enter number " + i + ": ");
                int number = s.nextInt();
                sum += number; // sum = sum + number;
                System.out.println(sum);
            }
            System.out.println("Average is: " + (double)sum / n);
        }
    }
