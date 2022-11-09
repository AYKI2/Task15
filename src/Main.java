import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter circumference: ");
            int radius = input.nextInt();
            System.out.println("Area: "+Circle.area(radius));
            System.out.println("Circumference: "+Circle.circumference(radius));
        }
    }
}