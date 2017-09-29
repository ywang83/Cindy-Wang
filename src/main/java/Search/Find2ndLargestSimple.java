package Search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class Find2ndLargestSimple {
    public static void main(String args[]) {
        final Integer[] array1 = { 2, -11, -8, 3,  5, -2, 7, 13, 17, 11 };
        final Integer[] array2 = { 2, -11, -8, 17, 5, -2, 7, 13, 17, 11 };

        System.out.println(FindSecond(array1));
        System.out.println(FindSecond(array2));
}

    public static int FindSecond(Integer[]array ) {
        int secondLargest = array [0];
        int max = (int) Collections.max(Arrays.asList(array));
        int i;

        for ( i = 0; i < array.length; i++) {
            if (array[i] < max && array[i]>=secondLargest)
                secondLargest = array[i];
        }
      //  return secondLargest;
        return (Arrays.asList(array)).indexOf(secondLargest);
    }
}

