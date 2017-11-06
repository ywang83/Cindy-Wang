package Textbook;
import java.util.*;
import java.util.Map.Entry;

public class mapMapEntry {
        public static void main(String[] args) {
            Map<Integer,Integer> mm = new HashMap<Integer,Integer>();
            for(int i=0;i<3;i++)   {
                mm.put(i, i);
            }
            for( Entry<Integer, Integer> e : mm.entrySet()) {
                System.out.println("key:"+e.getKey());
                System.out.println("value:"+e.getValue());
            }
            for( Iterator<Entry<Integer, Integer>> i = mm.entrySet().iterator(); i.hasNext(); ){
                Entry<Integer, Integer> e = i.next();
                System.out.println("key:"+e.getKey());
                System.out.println("value:"+e.getValue());
            }


            Map map = new HashMap();

            Iterator iterator = map.entrySet().iterator();

            while(iterator.hasNext()) {
                Map.Entry entry = (Entry) iterator.next();
                Object key = entry.getKey();
            }

            Set keySet= map.keySet();

            Iterator iterator2 = keySet.iterator();

            while(iterator2.hasNext()) {
                Object key = iterator2.next();
                Object value = map.get(key);
            }

            //另外，还有一种遍历方法是，单纯的遍历value值，Map有一个values方法，返回的是value的Collection集合。通过遍历collection也可以遍历value,如
//            Collection c = map.values();
//
//            Iterator iterator = c.iterator();
//
//            while(iterator.hasNext()) {
//                Object value = iterator.next();
//            }
//        }
    }
}
