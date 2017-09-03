import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner n =new Scanner(System.in);
        double firstNum;
        double secondNum;
        double answer;

        System.out.print("Enter the first number: ");
        firstNum = n.nextDouble();

        System.out.println("Enter the second number: ");
        secondNum = n.nextDouble();

        System.out.print("The answer is: ");
        answer = firstNum + secondNum;
        System.out.println(answer);
    }
}
