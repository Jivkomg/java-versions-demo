package java21;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatternMatchingSwitch {
    public static void main(String[] args) {
        System.out.println(asStringValue("Hello, World"));
        System.out.println(asStringValue(42));
        System.out.println(asStringValue(BigDecimal.valueOf(42)));
        System.out.println(asStringValue(LocalDate.now()));
        System.out.println(asStringValue(null));
    }

    static String asStringValue(Object anyValue) {
        return switch (anyValue) {
            case String str            -> str;
            case BigDecimal bd         -> bd.toEngineeringString();
            case Integer i when i > 10 -> Integer.toString(i);
            case LocalDate ld          -> ld.format(DateTimeFormatter.ISO_LOCAL_DATE);
            case null                  -> "null";
            default                    -> "n/a";
        };
    }
}
