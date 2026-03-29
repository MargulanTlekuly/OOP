package pr5.io.app;
                                               /* Problem 1 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while (true){
            try{
                System.out.println("Enter the first number: ");
                int x1 = Integer.parseInt(scan.nextLine());

                System.out.println("Enter the second number: ");
                int x2 = Integer.parseInt(scan.nextLine());

                int result = x1/x2;
                System.out.println("Result: " + result);
                break;
            }catch (ArithmeticException e){
                System.out.println("Error: Division by zero is impossible");
            }catch (NumberFormatException e){
                System.out.println("Error: Please enter an integer, not text");
            }
        }
        scan.close();
    }
}
