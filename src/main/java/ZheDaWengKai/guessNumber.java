package ZheDaWengKai;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args){
        int number = (int)(Math.random()*100+1);
        Scanner s = new Scanner(System.in);
        int a;
        int count=0;
        do{
            System.out.print("Enter a number: ");
            a = s.nextInt();
            count = count+1;
            if (a>number){
                System.out.println("Too large");
            }
            else if (a < number){
                System.out.println("Too small");
            }
        }while(a!=number);
        System.out.println("Congratulation! The mumber is " + number + ". You guessed " + count + " times." );
    }
}
