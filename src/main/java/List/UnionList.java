package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UnionList {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>(Arrays.asList("hello","Cindy", "what", "up"));
        List<String> listB = new ArrayList<>(Arrays.asList("hello","Roger", "what", "up", "?"));

        for(int i=0; i<listB.size(); i++ ){
            if(!listA.contains(listB.get(i))){
                listA.add(listB.get(i));
            }
        }

        System.out.println(listA);
        System.out.println(listB);

            if(listA.retainAll(listB)){
            System.out.println(listA);
        };

    }
}
