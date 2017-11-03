package Textbook;

public class recur {
    public static void main(String[] args) {
        String s = "Hello";
//        System.out.println(s.substring(1));
//        System.out.println(s.charAt(0));
//        System.out.println(s.length());
        printChars(s);
        System.out.println();
        printCharsReverse(s);
    }

//    public static int length(String str) {
//        if (str == null || str.equals(""))
//            return 0;
//        else
//            return 1 + length(str.substring(1));
//    }

    public static void printChars(String str) {
        if (str == null || str.equals(""))
            return;
        else {
            System.out.println(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    public static void printCharsReverse(String str) {
        if (str == null || str.isEmpty()) {
            return;
        } else {
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    //TODO modification
    public static boolean findChar(char c, String str) {
        if (str == null || str.isEmpty()) {
            return false;
        } else if  (c==str.charAt(0)){
            return true;
        }
        findChar(str.charAt(0), str.substring(1));
        return false; //TODO modification
    }
}