package Textbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapPractice {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
//        myMap.put(1, "Cindy");
//        myMap.put(2, "Roger");

        int i = 0;
        int size = myMap.size();
        System.out.println(myMap.get(1));
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        for (i=0;i<5;i++){
            myMap.put(i,s);
        }
        if (input.hasNext()){
            System.out.println(myMap.get(i));
        }
    }
}
