package java21;

public class RecordPattern {
    public static void main(String[] args) {
        Object r = new ColoredPoint(new Point2D(3, 4), Color.GREEN);
        if (r instanceof ColoredPoint(Point2D(int x, int y), Color c)) {
            // work with x, y, and c
            System.out.println("x: " + x + ", y: " + y + ", c: " + c);
        }
    }
}
interface Point { }
record Point2D(int x, int y) implements Point { }
enum Color { RED, GREEN, BLUE }
record ColoredPoint(Point p, Color c) { }


