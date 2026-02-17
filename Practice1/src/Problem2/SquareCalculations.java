package Problem2;

import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the square (a): ");
        double a = input.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);

        input.close();
    }
}
