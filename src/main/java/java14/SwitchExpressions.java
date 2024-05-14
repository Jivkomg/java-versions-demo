package java14;

public class SwitchExpressions {
    public static void main(String[] args) {
        String fruit = "Banana";
        String category = switch (fruit) {
            case "Banana", "Mango", "Papaya" -> "Tropical";
            case "Apple", "Orange", "Grape"  -> "Common";
            case "Strawberry"                -> "Berry";
            default                          -> {
                String result = "Unknown";
                yield result;
            }
        };
        System.out.println("Category of '" + fruit + "': " + category);

        int k = 3;
        System.out.println(
            switch (k) {
                case  1 -> "one";
                case  2 -> "two";
                default -> "many";
            }
        );

        Day day = Day.TUESDAY;
        String mood = switch (day) {
            case  MONDAY -> ":(";
            case  TUESDAY, WEDNESDAY, THURSDAY -> ":|";
            case  FRIDAY -> ":)";
            case  SATURDAY, SUNDAY -> ":D";
        };
        System.out.println("Mood on " + day + ": " + mood);
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
