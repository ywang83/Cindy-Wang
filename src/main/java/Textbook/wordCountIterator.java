package Textbook;

import java.util.*;

public class wordCountIterator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        count(input.toLowerCase());
    }

    private static void count(String s) {
        String str = s;
        String[] array = str.split(" ");
        List<String> list = new ArrayList<String>();
        for (int i=0; i<array.length; i++){
            list.add(array[i]);
        }
        Map<String, Integer> myMap = new HashMap<>();
        for (String temp:list){
            Integer count = myMap.get(temp);
            myMap.put(temp, (count ==null)? 1:count+1);
        }
        printMap(myMap);
    }

    private static void printMap(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
    }

}
