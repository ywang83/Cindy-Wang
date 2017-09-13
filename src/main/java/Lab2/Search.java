package Lab2;

import java.util.Arrays;

public class Search {
    public static void main(String args[]) {
        System.out.println(search());
    }

    public static int search() {
        int[] x = new int[]{1, 45, 78, 34, 89, 66};
        int target = 45;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == target)
                return i;
        }
        return -1;    // target not found
    }
}
