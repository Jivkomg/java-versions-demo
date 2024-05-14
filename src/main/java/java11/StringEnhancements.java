package java11;

public class StringEnhancements {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        String str1 = "    ";
        System.out.println("Is Blank: " + str.isBlank());
        System.out.println("Is Blank: " + str1.isBlank());
        System.out.println("Stripped: " + str.strip());
        System.out.println("Stripped Leading: " + str.stripLeading());
        System.out.println("Stripped Trailing: " + str.stripTrailing());
        System.out.println("Repeat: " + str.repeat(2));
        System.out.println("Lines: " + str.lines().count());
    }
}
