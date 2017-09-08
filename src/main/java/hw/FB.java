package hw;

public class FB {
    public String getNumber()
    {
        for(int n = 1; n<100; n++){
            if(n%15 == 0 ){
               System.out.println("fizzbuzz");
            }
            else if(n%5 == 0 ){
                System.out.println("buzz");
            }
            else if(n%3 == 0 ){
                System.out.println("fizz");
            }
            else {System.out.println( Integer.toString(n));}
        }
        return null;
    }
}


