package ZheDaWengKai;

import java.util.Arrays;
import java.util.Scanner;

public class arrayAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        int average =0;
        int[] array = new int[5];
        int i;
        for (i=0; i<array.length; i++){
            array[i]=s.nextInt();
            sum+=array[i];
        }
        System.out.println(Arrays.toString(array));

        average =sum/array.length;
        System.out.println("Average is " + average);

        for (i=0; i<array.length; i++) {
            if (array[i] > average) {
                System.out.println(array[i]);
            }
        }

    }
}
