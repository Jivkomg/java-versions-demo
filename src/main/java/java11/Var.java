package java11;

import java.time.LocalDate;
import java.util.Map;

public class Var {
    public static void main(String[] args) {
        var name = "Bob";
        var age = 25;
        var salary = 1000.0;
        var isMarried = false;
        var map = Map.of("key1", "value1", "key2", "value2");

        // This will not compile because the type of errorValue cannot be inferred
        // var errorValue = null;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Married: " + isMarried);
        System.out.println("Map: " + map);

        // Difficult to guess types of dayOfWeek and dayOfMonth
        var date = LocalDate.parse("2019-08-13");
        var dayOfWeek = date.getDayOfWeek();
        var dayOfMonth = date.getDayOfMonth();

        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Day of month: " + dayOfMonth);

        // Pay attention to preserve important type information
        byte   b = 1;
        short  s = 1;
        int    i = 1;
        long   l = 1;
        float  f = 1;
        double d = 1;

        var v = 1; // int
    }
}
