package myhashmap;

import java.util.*;

public class practise3 {
//    http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/Map.java
//    https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

    public static void main(final String[] args) throws InterruptedException {

        MyHashMap<String, Integer> fix = new MyHashMap<>();
        Iterator it = Arrays.asList("hello", "world", "what", "up").iterator();
        fix.put("hello", 1);
        Set<Map.Entry<String, Integer>> aSet = fix.entrySet();
        System.out.println(aSet);
        System.out.println(fix.get("hello"));

        HashMap<String, Integer> fixture = new HashMap<>();
        practise3 object = new practise3();
        object.put("hello", 1);
        Set<Map.Entry<String, Integer>> mySet = fix.entrySet();
        System.out.println(mySet);


        System.out.println(fixture.get("hello"));


    }

    public Object put(final String key, final Integer value) {
        // TODO follow basic approach of remove below (this will be similar)
        Map<String, Integer> aMap = new HashMap<>();
        aMap.put(key,value);
        Set entries = aMap.entrySet();
        List<Map.Entry<String, Integer>> list = new LinkedList<>();
        list.addAll(entries);
        if (entries != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                Object newValue = entry.getValue();
                return newValue;
            }
        }
        return null;
    }
    }


//    public V put(final K key, final V value) {
//        // TODO follow basic approach of remove below (this will be similar)
//        Map<K, V> aMap = new HashMap<>();
//        aMap.put(key,value);
//        Set entries = aMap.entrySet();
//        List<Map.Entry<K,V>> list = new LinkedList<>();
//        list.addAll(entries);
//        table.add(list);
//        if (entries != null) {
//            Iterator iterator = list.iterator();
//            while (iterator.hasNext()) {
//                Map.Entry entry = (Map.Entry) iterator.next();
//                Object newValue = entry.getValue();
//                return (V) newValue;
//            }
//        }
//        return null;
//    }


//    public V put(final K key, final V value) {
//        // TODO follow basic approach of remove below (this will be similar)
//        final int index = calculateIndex(key);
//        final Iterator<Map.Entry<K, V>> iter = table.get(index).iterator();
//        while (iter.hasNext()) {
//            final Map.Entry<K, V> entry = iter.next();
//            if (entry.getKey().equals(key)) {
////        V oldVal = entry.getValue();
//                V oldVal = entry.getValue();
//        entry.setValue(value);
//                return oldVal;
//            }
//        }
//        return null;
//    }

//    public V put(final K key, final V value) {
//        // TODO follow basic approach of remove below (this will be similar)
//        final int index = calculateIndex(key);
//        for (Map.Entry<K, V> entry : table.get(index)) {
//            if (entry.getKey().equals(key)) {
//                V oldVal = entry.getValue();
//                entry.setValue(value);
//                return oldVal;
//            }
//        }
//        table.get(index).add(new Map.Entry<>(key, value));
//        return null;
//    }



//    public void putAll(final Map<? extends K, ? extends V> m) {
//        // TODO add each entry in m's entrySet
//        Set<? extends Map.Entry<? extends K, ? extends V>> mySet = m.entrySet();
//        List<Map.Entry<K, V>> list = new LinkedList<>();
////    list.addAll((Collection<? extends Entry<K, V>>) mySet);
//        Iterator it = mySet.iterator();
//        while (it.hasNext()) {
//            Map.Entry entry = (Map.Entry) it.next();
////      list.add((Entry<K, V>) it.next());
//            table.add(list.add((entry));
//        }
////    for( Entry<? extends K, ? extends V> entries:m.entrySet()){
////      list.add((Entry<K, V>) entries);
////  }
////    table.add(list);
//    }