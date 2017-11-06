package bucky;

import java.util.Scanner;

public class input {
    public static void main (String args[]){
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();
//        System.out.print("Please input here: ");
//        System.out.println(a.nextLine());

        if (a.hasNext()){
            System.out.println(s);
        }
        
    }
}
