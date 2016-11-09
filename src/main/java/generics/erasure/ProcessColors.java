package generics.erasure;

import java.awt.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ProcessColors {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color applyFilter(UnaryOperator<Color> filter) {
        return filter.apply(color);
    }

    @SafeVarargs
    public final Color applyFilters(Function<Color,Color>... filters) {
        return Arrays.stream(filters)
                .reduce(Function.identity(), Function::andThen)
                .apply(color);
    }
}
