package Textbook;

import java.util.*;

public class mapMap {

    public static void main(final String[] args) throws InterruptedException {

        // set up the scanner so that it separates words based on space and punctuation
        final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
        Map<String, Integer> aMap = new HashMap<>();

        List<String> list = new ArrayList<String>();
        while (input.hasNext()) {
            String[] array = input.nextLine().split(" ");
            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
        for (String temp : list) {
            String word = temp.toLowerCase();
            if (aMap.containsKey(word)) {
                int count = aMap.get(word);
                aMap.put(word, count + 1);
            } else
                aMap.put(word, 1);
        }

        Set<String> keys = aMap.keySet();
        Set entries = aMap.entrySet();
        if (entries != null) {
            Iterator iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key + " " + value);
            }
        }
    }
}
