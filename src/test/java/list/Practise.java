package list;

import java.util.ArrayList;


 /*
  Test Duration         	 SIZE=10    SIZE=100    SIZE=1000     SIZE=10000
  testArrayListAccess	     0.012s     0.068s      0.100s        0.035s
  testArrayListAddRemove	 0.034s     0.067s      0.246s        2.536s
  testLinkedListAccess	     0.016s     0.077s      0.485s        6.490s
  testLinkedListAddRemove	 0.115s     0.793s      1.236s        0.531s
  */

public class Practise {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();
        list.add(3);
        list.add(77);
        list.add(4);
        list.add(77);
        list.add(5);//
        list.add(77);//
        list.add(6);
        System.out.println(list);

        list.remove(5); // what does this method do?

        // list.remove(Integer.valueOf(5)); // what does this one do?

        System.out.println(list);

    }
    }

    /*
        int SIZE = 10;
        int REPS = 100;
        int sum = 0;

        ArrayList arrayList = new ArrayList<Integer>(SIZE);
        //LinkedList linkedList = new LinkedList<Integer>();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
           // linkedList.add(i);

        for (int r = 0; r < REPS; r++) {
            sum += arrayList.get(r % SIZE);
        }
        System.out.println(sum);
    }
}
*/

 /*      ArrayList list = new ArrayList<Integer>();
        list.add(33);
        list.add(77);
        list.add(44);
        list.add(77);
        list.add(55);
        list.add(77);
        list.add(66);

        double sum = 0;
        int n = 0;
        double mean = 0;

        final Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            sum += i.next();
            n = list.size();
            mean = sum / n;
        }
        System.out.println(mean);
    }
}

       /* final Iterator<Integer> i = list.iterator();
       while (i.hasNext()) {
            if (i.next() == 77) {
                i.remove(); // TODO what happens if you use list.remove(77)?
            }
        }
        // list.remove(77);
         System.out.println(list);
    }
}
*/