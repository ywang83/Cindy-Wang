package Search;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find2ndLargestPractice {
    public static void main(String args[]) {
        final Integer[] array1 = { 2, -11, -8, 3,  5, -2, 7, 13, 17, 11 };
        final Integer[] array2 = { 2, -11, -8, 17, 5, -2, 7, 13, 17, 11 };

        System.out.println(FindSecond(array1));// Optional[7]
        System.out.println(FindSecond(array2));// Optional[8]
    }

    public static Optional<Integer> FindSecond(Integer[]array ) {
        int largest = Integer.MIN_VALUE;
        int secondLargesst = Integer.MIN_VALUE;
        List<Integer> list = Arrays.asList(array);
//        int largest = array[0];
//        int secondLargesst = array[0];
        int i;
        int index =0;

        for (i = 0; i < array.length; i++) {
            if (list.get(i) >= largest) {
                secondLargesst = largest;
                largest = list.get(i);
                index = list.indexOf(secondLargesst);
            }
        }
        return Optional.of(index);
//         return Optional.of((Arrays.asList(array)).indexOf(secondLargesst));
    }
}

