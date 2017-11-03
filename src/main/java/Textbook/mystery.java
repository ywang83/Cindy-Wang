package Textbook;

public class mystery {

    public static void main (String[] args) {
        System.out.println(mystery(4));
    }

    public static int mystery(int n) {
        if (n == 0)
            return 0;
        else
            return n * n + mystery(n- 1);
    }

//    mystery(4) (condition false, recursive case)
//            | mystery(3) (condition false, recursive case)
//            | | mystery(2) (condition false, recursive case)
//            | | | mystery(1) (condition false, recursive case)
//            | | | | mystery(0) (condition true, base case)
//            | | | |  return 0
//            | | |  return 1square + 0
//            | |  return 2square + 1square + 0
//            |  return 3square + 2square + 1square + 0
//             return 4square + 3square + 2square + 1square + 0
//    This function returns the sum of squares of all integers up to the input integer.
}
