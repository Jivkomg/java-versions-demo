package java16;

public class Records {
    public record Point(int x, int y) { }

    public static void main(String[] args) {
        var point = new Point(1, 2);
        System.out.println(point.x());
        System.out.println(point.y());
    }
}
