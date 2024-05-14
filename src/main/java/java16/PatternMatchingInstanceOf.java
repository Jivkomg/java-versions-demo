package java16;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) {
        // Before Java 16
        Object obj = "Hello, World";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.toUpperCase());
        }

        // Java 16
        Object obj1 = "Hello, World";
        if (obj1 instanceof String str) {
            System.out.println(str.toUpperCase());
        }
    }

    private static int getLength(Object obj) {
        if (!(obj instanceof String str)) {
            throw new IllegalArgumentException("Object is not a String");
        }
        // s is in scope here
        return str.length();
    }
}
