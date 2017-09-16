package Lab2p;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        //int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};
        int[]array={2, 3, 4, 5, 32, 34, 54, 56, 98};
        int n = array.length;
        int k = n-1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(n);
        System.out.println(array[k]);
    }
}
