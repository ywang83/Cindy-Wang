package dataStructure;

import java.lang.annotation.ElementType;
import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        int[] array = {2, -11, -8, 3, 5, -2, 7, 13, 17, 11};


        System.out.println(Arrays.toString(array));
        print(array.length);
        print(array[2]);
        print(findMin(array));
        print(linearSearch(array, 5));

        System.out.println(Arrays.toString(sort(array)));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
    }

    public static void print(int s ){
        System.out.println(s);
    }

    public static int linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if (x==arr[i]){
                return i;
            }
        }
        return -1;
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                if (array[i] <= array[j]) {
                    int min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
        }
        return array;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

}
