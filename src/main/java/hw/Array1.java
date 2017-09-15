package hw;

import java.util.Arrays;

public class Array {
    public static void main (String args[]) {
        int n[] = new int[100];
        for (int i=0; i<n.length; i++){
            n[i]=i+1;
            //System.out.println(n[i]);
        }
        System.out.println(Arrays.toString(n));
    }
}
