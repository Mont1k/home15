public class Circle {
    private static final double pi = Math.PI;

    public static void area(double num) {
        System.out.println(pi * num * num);
    }

    public static void circumference(double num) {
        System.out.println((pi * 2) * num);
    }
}
