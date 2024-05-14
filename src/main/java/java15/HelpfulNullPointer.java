package java15;

public class HelpfulNullPointer {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.isBlank()); // NullPointerException
    }
}
