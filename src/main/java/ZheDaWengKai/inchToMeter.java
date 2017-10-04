package ZheDaWengKai;

import java.util.Scanner;

public class inchToMeter {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Please input your height in feet: ");
        int foot = s.nextInt();
        double foot1= foot;
        System.out.print("Please input your height in inch: ");
        int inch = s.nextInt();
        double inch1= inch;
        System.out.println("Your height in meter: " + ((foot + inch/12)*0.3048 + " m"));
        System.out.println("Your height in meter: " + ((foot + inch/12.0)*0.3048 + " m"));
        System.out.println("Your height in meter: " + ((foot1 + inch1/12)*0.3048 + " m"));
        System.out.println("Your height in meter: " + ((foot1 + inch1/12.0)*0.3048 + " m"));
        System.out.println("Your height in meter: " + ((int)((foot1 + inch1/12.0)*0.3048*100) + " cm"));

    }
}
