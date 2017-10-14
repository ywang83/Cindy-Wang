package Search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Find2ndLargestOptional {
    public static void main(String args[]) {
        final Integer[] array1 = { 2, -11, -8, 3,  5, -2, 7, 13, 17, 11 };
        final Integer[] array2 = { 2, -11, -8, 17, 5, -2, 7, 13, 17, 11 };

        System.out.println(FindSecond(array1));// Optional[7]
        System.out.println(FindSecond(array2));// Optional[8]
}

    public static Optional<Integer> FindSecond(Integer[]array ) {
        int secondLargest = array [0];
        int max = (int) Collections.max(Arrays.asList(array));
        int i;
//        int index=0;

        for ( i = 0; i < array.length; i++) {
            if (i!=(Arrays.asList(array)).indexOf(max)&& array[i] <= max && array[i]>secondLargest)
                secondLargest = array[i];
//            index= i;
        }
//        return Optional.of(i);
        return Optional.of((Arrays.asList(array)).indexOf(secondLargest));
    }
}

