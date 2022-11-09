public class Circle {
    private static final double pi = Math.PI;

    public static double area(int radius){
        return pi * (radius*radius);
    }

    public static double circumference(int radius){
        return (pi*2)*radius;
    }
}
