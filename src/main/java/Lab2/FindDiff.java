package Lab2;
import java.util.Arrays;

public class FindDiff {
    public static void main(String args[]) {
        System.out.println(search());
    }

    public static boolean search() {
        int[] x = new int[]{1, 45, 78, 34, 89, 66};
        int[] y = new int[]{2, 33, 99,34};
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++)
            if (x[i] == y[j]) {
                return true;
            }
        }
        return false;    // target not found
    }
}
