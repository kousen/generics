package generics.sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toMap;

public class SortingMaps<K extends Comparable<? super K>, V extends Comparable<? super V>> {
    private Map<K, V> map = new HashMap<>();

    public void setMap(Map<K, V> map) {
        this.map = map;
    }

    public Map<K, V> getMap() {
        return map;
    }

    public Map<K, V> getMapSortedByKey() {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public Map<K, V> getMapSortedByKeyDesc() {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(reverseOrder()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public Map<K, V> getMapSortedByValue() {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public Map<K, V> getMapSortedByValueDesc() {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(reverseOrder()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }
}
