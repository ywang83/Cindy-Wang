package hw;

public class FizzBuzz {
    public static void main(String arg[]){
        FizzBuzz fb = new FizzBuzz();
        fb.getNumber(3);
    }

    public String getNumber(int n)
    {
        for(n = 1; n<100; n++){
            if(n%15 == 0 ){
               System.out.println ("fizzbuzz");
            }
            else if(n%5 == 0 ){
                System.out.println ("buzz");
            }
            else if(n%3 == 0 ){
                System.out.println ("fizz");
            }
            else {System.out.println (Integer.toString(n));}
        }
        return null;
    }
}


