package bucky;

public class Buzz {
    public static void main (String args[]){
        int n=1;
        while(n<100){
            if(n%15 == 0 ){
                System.out.println("fizzbuzz");
            }
            else if(n%5 == 0 ){
                System.out.println("buzz");
            }
            else if(n%3 == 0 ){
                System.out.println("fizz");
            }
            else {System.out.println(n);}
            n++;
        }

    }
}
