package generics.types;

/**
 * Created by Ken Kousen on 11/9/16.
 */
public class UsePair {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1, "abc");
        Pair<Integer, Integer> xp = p.transform(n -> n * 2, String::length);
        Pair<Double, Integer> xp1 = p.transform(Integer::doubleValue, Object::hashCode);

        Pair<String, Integer> rev = p.reverse();

        System.out.println(p);
        System.out.println(xp);
        System.out.println(xp1);
        System.out.println(rev);
    }
}
