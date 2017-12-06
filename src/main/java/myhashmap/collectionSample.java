package myhashmap;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class collectionSample {

    public static void main(String[] s) {
        // create set
        Set<String> set = new HashSet<String>();

        // populate the set
        set.add("Welcome");
        set.add("to");
        set.add("TP");

        System.out.println("Initial set value: "+set);

        // create unmodifiable set
        Set unmodset = Collections.unmodifiableSet(set);
        System.out.println("Now " + unmodset);

        // try to modify the set
        unmodset.add("Hello");


    }
}
