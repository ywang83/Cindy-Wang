package Search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Find2ndLargestSimple {
    public static void main(String args[]) {
        final Integer[] array1 = { 2, -11, -8, 3,  5, -2, 7, 13, 17, 11 };
        final Integer[] array2 = { 2, -11, -8, 17, 5, -2, 7, 13, 17, 11 };

        System.out.println(FindSecond(array1));// Optional[7]
        System.out.println(FindSecond(array2));// Optional[8]
    }

    public static Optional<Integer> FindSecond(Integer[]array ) {
        //int largest = Integer.MIN_VALUE;
        //int secondLargesst = Integer.MIN_VALUE;
        int largest = array[0];
        int secondLargesst = array[0];
        int i;
        int index =0;

        for (i = 0; i < array.length; i++) {
        //for (i = array.length-1;i >= 0; i--) {
            if (array[i] >= largest) {
                secondLargesst = largest;
                largest = array[i];
                index = i;
            }
            else if (array[i] >= secondLargesst) {
               secondLargesst = array[i];
                index = i;
           }
        }
        return Optional.of(index);
        // return Optional.of((Arrays.asList(array)).indexOf(secondLargesst));
    }
}

