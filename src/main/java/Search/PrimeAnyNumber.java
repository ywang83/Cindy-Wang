import java.util.ArrayList;
import java.util.Scanner;

public class prime50 {
	
	    public static void main(String[] args) {
	    	
	    	Scanner scan = new Scanner(System.in);
	    	System.out.print("Enter a number: ");
	        int n =scan.nextInt();
	        int count=0;
	        int num=2;
	        while(count!=n)// while count!= number of prime numbers entered keep searching.. 
	        {
	            boolean prime=true;// to determine whether the number is prime or not
	            for (int i=2;i<=Math.sqrt(num);i++)//efficiency matters
	            {
	                if (num%i==0)
	                {
	                    prime=false;// if number divides any other number its not a prime so set prime to false and break the loop.
	                    break;
	                }

	        }
	            if (prime)
	            {
	                count++;
	                System.out.println(num);
	            }
	            num++; 

	        }
	   }
}     

