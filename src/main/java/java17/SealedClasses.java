package java17;

public class SealedClasses {
    public static void main(String[] args) {
        System.out.println("Sealed classes are introduced in Java 17");
    }
}

sealed class Shape permits Circle, Rectangle, Triangle {
    // Common methods and properties for shapes
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

final class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

