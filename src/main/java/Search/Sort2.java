package Search;

import Lab2p.Search;

import java.util.Arrays;

public class Sort2 {
    public static void main (String[] args){
        System.out.println(binarySearch());
    }

    private static int binarySearch() {
       // int[] array = {2,3,4,5,34,56,98,32,54};
        int[] array =  {2,3,4,5,32,34,54,56,98};
        System.out.println(Arrays.toString(array));

        int n= array.length;
        //int k=n-1;

        int array1[] = new int[n];
        for (int i=0; i<n;i++){
            array1[i]=i;
        }
        System.out.println(Arrays.toString(array1));

        int x=55;
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
