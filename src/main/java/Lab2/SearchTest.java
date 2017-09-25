package Lab2;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchTest {
    public static void main(final String args[]) {

        System.out.println(findTeamPosition());
    }


        public static int findTeamPosition( ) {
            final Team t1 = new Team("USA", "Klinsmann", 500);
            final Team t2 = new Team("Chile", "Pizzi", 600);
            final Team t3 = new Team("Germany", "Löw", 700);
            final Team t4 = new Team("USA", "Lipi", 700);
            Team[] array = new Team[]{t1, t2, t3, t4};

            final Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter name to search: ");
            final String key = keyboard.nextLine();
            System.out.println("Looking for team " + key);
            System.out.println("  ");

            final int size = array.length;

            for (int i = 0; i < size; i++) {
                if (array[i].getName().equals(key)) {
                    return i;
                }
            }
            // If it does not exist in the array then return an empty Optional
            return -1;
        }


}