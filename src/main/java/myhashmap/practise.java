package myhashmap;

import java.util.*;

public class practise {
//    http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/Map.java
//    https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

    public static void main(final String[] args) throws InterruptedException {
        HashMap<String, Integer> fixture = new HashMap<>();
        MyHashMap<String, Integer> fix = new MyHashMap<>();
        Iterator it = Arrays.asList("hello", "world", "what", "up").iterator();
        fix.put("hello", 1);
        Set<Map.Entry<String, Integer>> aSet = fixture.entrySet();
        System.out.println(aSet);
        System.out.println(fix.get("hello"));

        practise object = new practise();
        object.fillMap(fixture,it);

        Set<Map.Entry<String, Integer>> mySet = fixture.entrySet();
        System.out.println(mySet);

        fixture.remove("hello");
        fixture.put("hi", 0);
        System.out.println(mySet);
    }

        public void fillMap(Map<String, Integer> fixture, final Iterator<String> it) {
        int count = 0;
        while (it.hasNext()) {
            String temp = (String) it.next();
            fixture.put(temp, count);
            count++;
        }
        }


//        System.out.println(fixture.get("hello"));
//        System.out.println(fixture.get("world"));
//        System.out.println(fixture.get("what"));
//        MyHashMap object = new MyHashMap();
//        object.remove();

    }


//    import java.util.*;
//
//public class CollectionsDemo {
//    public static void main(String[] s) {
//        // create set
//        Set<String> set = new HashSet<String>();
//
//        // populate the set
//        set.add("Welcome");
//        set.add("to");
//        set.add("TP");
//
//        System.out.println("Initial set value: "+set);
//
//        // create unmodifiable set
//        Set unmodset = Collections.unmodifiableSet(set);
//
//        // try to modify the set
//        unmodset.add("Hello");
//    }
//}