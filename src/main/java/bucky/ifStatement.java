package bucky;

public class ifStatement {
    public static void main (String args[]){
        int n = 6;
        if (n==9){
            System.out.println("yes");}
        else if (n!=9){
            System.out.println("not equals 9");
        }
         else if (n>5){  //if use "else if" will not executive
            System.out.println("greater than 5");
        }
         if (n>=3){  //if use "else if" will not executive
            System.out.println("greater equal than 3");
        }
        else {
            System.out.println("else"); // will not executive
        }
    }
}
