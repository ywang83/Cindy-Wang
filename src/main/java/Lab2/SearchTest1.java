package Lab2;


import java.util.Scanner;

public class SearchTest1 {
    public static void main(final String args[]) {

       // System.out.println(findTeamPosition());
   // }


     //   public static int findTeamPosition( ) {
           int[] array = {15, 20, 15, 28};

            Scanner keyboard = new Scanner(System.in);

           // System.out.print("Enter name to search: ");
           // String key = keyboard.nextLine();
           // System.out.println("Looking for team " + key);
           // System.out.println("  ");

            int key = 15;
            final int size = array.length;

            for (int i = 0; i < size; i++) {
               // if (array[i] == Integer.parseInt(key))
                if (array[i] == key)
                    //return i;
                    System.out.println(i);
            }


           // return -1;
        }


}