package generics.raw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ken Kousen on 11/8/16.
 */
public class RawTypes {
    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("this");
        strings.add("is");
        strings.add("a");
        strings.add("RAW");
        strings.add("list");
        strings.add("of");
        strings.add("strings");

        for (Object o : strings) {
            String s = (String) o;
            System.out.printf("%7s has %d characters%n", s, s.length());
        }
    }
}
