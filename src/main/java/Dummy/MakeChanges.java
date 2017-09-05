package Dummy;

import static java.lang.System.out;

/**
 * Created by ywang83 on 9/5/2017.
 */
public class MakeChanges {
    public static void main(String[] args) {
        // write your code here
        int total =248;
        int quarter=25;
        int whatLeft=total%25;

        int dime=whatLeft/10;
        whatLeft=whatLeft%10;

        int nickle=whatLeft/5;
        whatLeft=whatLeft%5;

        int cent=whatLeft;

        out.println("from "+ total + " cents you get:");
        out.println(quarter + " quaters");
        out.println(dime+" dimes");
        out.println(nickle +" nickes");
        out.println(cent + " cents");

    }
}
