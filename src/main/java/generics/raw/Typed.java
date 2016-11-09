package generics.raw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ken Kousen on 11/8/16.
 */
public class Typed {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("this");
        strings.add("is");
        strings.add("a");
        strings.add("RAW");
        strings.add("list");
        strings.add("of");
        strings.add("strings");

        for (String s : strings) {
            System.out.printf("%7s has %d characters%n", s, s.length());
        }

        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(new Integer(4));
        int x = ints.get(0);
        int y = ints.get(1);
    }
}
