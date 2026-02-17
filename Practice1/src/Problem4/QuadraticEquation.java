package Problem4;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("Error: The equation has no real roots (D is negative).");
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double denominator = 2 * a;

            double x1 = (-b + sqrtD) / denominator;
            double x2 = (-b - sqrtD) / denominator;

            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
        sc.close();
    }
}
