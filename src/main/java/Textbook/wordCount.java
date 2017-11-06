package Textbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class wordCount {
    public static void main(String[] args){
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for(String token: tokens){
            String word = token.toLowerCase();

            if(map.containsKey(word)){
                int count = map.get(word);
                map.put(word, count + 1);
            }
            else
                map.put(word, 1);
        }
    }

    private static void displayMap(Map<String, Integer> map){
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.println();

        for(String key:sortedKeys)
            System.out.println(key + " " + map.get(key) );
        System.out.println(map.size() +" " +map.isEmpty() );
    }
}
