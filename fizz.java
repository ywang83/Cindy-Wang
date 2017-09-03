package hw;

public class fizz {
    public static void main(String arges[])
    {
        int n = 1;
        for(n = 1; n<100; n++){
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
        }

    }
}
