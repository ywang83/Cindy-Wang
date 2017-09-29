//package Search;

public class Smallest {

    public static void main(String args[]) {
        System.out.println(search());
    }

    public static int search() {
        int[] x = new int[]{1, 45, 78, 34, 89, 66};
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++){
                if (x[i] <= x[j]) {
                    return x[j];
                }
        }
        return -1;    // target not found
    }
}
