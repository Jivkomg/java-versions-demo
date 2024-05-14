package java10;

import java.util.Optional;

public class OrElseThrow {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("Hello");

        // Retrieve the value from the Optional using orElseThrow
        String value = optionalWithValue.orElseThrow(() -> new IllegalStateException("Value is not present"));
        System.out.println("Value retrieved: " + value);

        Optional<String> optionalEmpty = Optional.empty();

        try {
            String emptyValue = optionalEmpty.orElseThrow(() -> new IllegalStateException("Value is not present"));
            System.out.println("This won't be printed because an exception will be thrown before reaching here");
        } catch (IllegalStateException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
