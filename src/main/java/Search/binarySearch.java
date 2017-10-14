package Search;

import java.util.Arrays;

public class binarySearch {
    public static void main (String[] args){
        int[] array =  {2,3,4,5,32,34,54,56,98};
        int x =32;
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array,x));
    }

    private static int binarySearch(int[] array, int x) {
        int n= array.length;

        int array1[] = new int[n];
        for (int i=0; i<n;i++){
            array1[i]=i;
        }
        System.out.println(Arrays.toString(array1));

        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;
            if (array[mid]==x)
                return mid;
            else if (array[mid]>x)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;

    }
}
