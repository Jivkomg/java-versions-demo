package java10;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CopyOfMethod {
    public static void main(String[] args) {
        List<String> newList = List.of("Bob", "Alice", "John");
        List<String> copiedList = List.copyOf(newList);

        Map<String, String> newMap = Map.of("key1", "value1", "key2", "value2");
        Map<String, String> copiedMap = Map.copyOf(newMap);

        Set<String> newSet = Set.of("Bob", "Alice", "John");
        Set<String> copiedSet = Set.copyOf(newSet);

        System.out.println(newList);
        System.out.println(copiedList);
        System.out.println(newMap);
        System.out.println(copiedMap);
        System.out.println(newSet);
        System.out.println(copiedSet);
    }
}
