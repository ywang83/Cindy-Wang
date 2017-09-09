package hw;

public class FizzBuzz1 {

    public static void main(String arg[]) {
        for (int i = 1; i < 100; i++) {
            System.out.println(getNumber(i));
        }
    }

    public static String getNumber(int n)
    {
        if(n%15 == 0 )
            return "fizzbuzz";
        else if(n%5 == 0 )
            return "buzz";
        else if(n%3 == 0 )
            return "fizz";
        else return Integer.toString(n);
    }


}


