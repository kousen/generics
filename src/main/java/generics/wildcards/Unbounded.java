package generics.wildcards;

import java.time.LocalDate;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ken Kousen on 11/8/16.
 */
public class Unbounded {
    public static void main(String[] args) {
        List<?> stuff = Arrays.asList("Hello", LocalDate.now(), 3);

        System.out.println(stuff.size());
        stuff.forEach((Object o) -> System.out.println(o));

        // stuff.add(... anything ...);

        stuff.containsAll(Arrays.asList("Whatever", "else"));
        // AbstractCollection
    }
}
