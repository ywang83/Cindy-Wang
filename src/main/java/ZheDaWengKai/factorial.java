package ZheDaWengKai;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:k ");
        int n = s.nextInt();
        int factor = 1;
        for(int i=2; i<=n; i++ ){
            //factor = factor *i;
            factor *=i;
            System.out.println(factor);
        }

    }
}
