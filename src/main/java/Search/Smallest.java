package Search;

public class Smallest {

    public static void main(String args[]) {
        int[] x = new int[]{1, 45, -78, -34, 89, 66};
        System.out.println(search(x));
    }

    public static int search(int[] x) {

        int smallest = x[0];
        int i;
        int index = 0;
        for (i = 0; i < x.length; i++) {
                if (x[i] <= smallest) {
                    smallest = x[i];
                    index = i;
                }
        }
        //return smallest;
        return index;
    }
}

