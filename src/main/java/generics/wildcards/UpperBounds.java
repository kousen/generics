package generics.wildcards;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by Ken Kousen on 11/9/16.
 */
public class UpperBounds {
    public static double sumList(List<? extends Number> list) {
        return list.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<>();
        // numbers.add(3);
        // numbers.add(3.14159);
        // numbers.add(new BigDecimal("3"));

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers = IntStream.rangeClosed(1, 5)
                .mapToObj(Integer::new)
                .collect(Collectors.toList());

        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> doubles1 = DoubleStream.iterate(1.0, d -> d + 1.0)
                .limit(5)
                .mapToObj(Double::new)
                .collect(Collectors.toList());

        List<BigDecimal> bigDecimals = IntStream.rangeClosed(1, 5)
                .mapToObj(BigDecimal::new)
                .collect(Collectors.toList());

        System.out.println(sumList(ints));
        System.out.println(sumList(integers));
        System.out.println(sumList(doubles));
        System.out.println(sumList(doubles1));
        System.out.println(sumList(bigDecimals));
    }
}
