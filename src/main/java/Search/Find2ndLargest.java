package Search;

import java.util.Arrays;
import java.util.List;

public class Find2ndLargest {
    public static void main(String args[]) {
        Integer[] array1 = { 2, -11, -8, 3,  5, -2, 7, 13, 17, 11 };
        Integer[] array2 = { 2, -11, -8, 17, 5, -2, 7, 13, 17, 11 };

        int x = FindSecond(array1);
        int y = FindSecond(array2);
        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);

        //System.out.println(list.get(2));
        //System.out.println(FindSecond(array));
       System.out.println(list1.indexOf(x));
       System.out.println(list2.indexOf(y));
}

    public static int FindSecond(Integer[] array ) {
        int secondLargest = array[0];
        // int secondLargest = array[0];
        int i;
        //  for ( i = 1; i < array.length; i++) { // both will work.
        for ( i = 0; i < array.length; i++) {
            if (array[i]>secondLargest && array[i] < FindLargest(array))
                secondLargest = array[i];
        }
        return secondLargest;
        // return i;// Why always wrong answer.
    }

    public static int FindLargest(Integer[]array ) {
        int largest = array[0];
       // int secondLargest = array[0];
        int i;
        //  for ( i = 1; i < array.length; i++) { // both will work.
        for ( i = 0; i < array.length; i++) {
            if (array[i] > largest)
                largest = array[i];
        }
        return largest;
    }
}

