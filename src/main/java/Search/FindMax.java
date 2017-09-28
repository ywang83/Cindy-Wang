package Search;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String args[]) {
        int[] array = new int[]{45, -78, 34, 89, 66, 150};
        System.out.println(FindMax(array));
}

    public static int FindMax(int[] array) {
        int max = array[0];
        int i;
      //  for ( i = 0; i < array.length; i++) { // both will work.
        for ( i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
        // return i;// Why always wrong answer.
    }
}
