package List;
import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main (String[] args){

        List<String> myList = new ArrayList<>();

        myList.add("Bashful");
        myList.add("Awful");
        myList.add("Jumpy");
        myList.add("Happy");
        System.out.println(myList);

        String s = myList.get(2);
        System.out.println(s);

        String dwarf=myList.get(3);
        System.out.println(myList);

        myList.add("Pokey");
        myList.add("Campy");
        int i = myList.indexOf("Happy");
        System.out.println(myList);
        System.out.println(i);

        myList.set(i, "Bouncy");
        System.out.println(myList);

        myList.remove(myList.size()-2);
        System.out.println(myList);

        String temp = myList.get(1);
        System.out.println(temp);

        myList.set(1, temp.toUpperCase());
        System.out.println(myList);


    }
}
