package Textbook;

import java.util.*;

public class wordCountHomework {
    public static void main(String[] args){
        Map<String, Integer> myMap = new HashMap<>();
        buildMap(myMap);
        displayMap(myMap);
        displayMapEntry(myMap);
    }

    private static void buildMap(Map<String, Integer> myMap) {
        Scanner input = new Scanner(System.in);

        List<String> list = new ArrayList<String>();
        while (input.hasNext()) {
            String[] array = input.nextLine().split(" ");
            for (int i=0; i<array.length; i++){
                list.add(array[i]);
            }
        }
        System.out.println(list);

        for (String temp : list) {
            String word = temp.toLowerCase();
            if (myMap.containsKey(word)) {
                int count = myMap.get(word);
                myMap.put(word, count + 1);
            } else
                myMap.put(word, 1);
        }
    }

    private static void displayMap(Map<String, Integer> myMap) {
        Set<String> keys = myMap.keySet();
        if (keys != null) {
            Iterator iterator = keys.iterator();
            while (iterator.hasNext()) {
                Object key = iterator.next();
                Object value = myMap.get(key);
                System.out.println(key + " " + myMap.get(key) );
            }
        }
    }

    private static void displayMapEntry(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        Set entries = map.entrySet();
        if (entries != null) {
            Iterator iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key + " " + entry.getValue());
            }
        }
    }
}
