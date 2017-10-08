package bucky;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main (String args[]) {
        String[] things = {"hello", "Cindy", "what", "up"};
        List<String>  list = new LinkedList<>();
        for (String x : things)
            list.add(x);

        System.out.println(list);

    }
}
