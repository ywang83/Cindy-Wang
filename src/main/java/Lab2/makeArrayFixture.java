package Lab2;

import java.util.Arrays;

public class makeArrayFixture {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeArray()));
    }

    public static Team[] makeArray() {
        int size=10;
        final Team[] array = new Team[size];
        for (int i = 0; i < size; i++) {
            final String s = Integer.toString(i);
            array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
        }
        return array;
    }
}
