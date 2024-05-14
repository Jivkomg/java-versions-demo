package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMethod {
    public static void main(String[] args) {
        List<String> newList = List.of("Bob", "Alice", "John");
        Map<String, String> newMap = Map.of("key1", "value1", "key2", "value2");
        Set<String> newSet = Set.of("Bob", "Alice", "John");

        System.out.println(newList);
        System.out.println(newMap);
        System.out.println(newSet);
    }
}
