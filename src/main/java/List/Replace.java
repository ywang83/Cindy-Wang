package List;

import java.util.ArrayList;
import java.util.List;

/** Replaces each occurrence of oldItem in aList with newItem. */


public class Replace {
    public static void main (String[] args){

    }

    public static void replace(ArrayList<String> aList, String oldItem, String newItem){
        aList = new ArrayList<>();
        aList.add("Bashful");
        aList.add("Awful");
        aList.add("Jumpy");
        aList.add("Happy");

        oldItem = aList.get(3);
    }
}
