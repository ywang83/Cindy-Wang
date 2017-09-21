package Lab2;

import java.util.ArrayList;
import java.util.List;

public class makeListFixture {
    public static void main(String[] args) {
        System.out.println(makeList().get(0));
    }

        public static List<Team> makeList() {
            final List<Team> list = new ArrayList<>();
           // if (list != null) {
                final int size = list.size();
                for (int i = 0; i < size; i++) {
                    final String s = Integer.toString(i);
                    Team temp =  new Team("Team " + s, "Coach " + s, i * 100 + 50);
                    list.add(temp);
                   // list.add(i,(new Team("Team " + s, "Coach " + s, i * 100 + 50)));
                }
                return list;
            }
           // return null;
       // }

}
