package pr5.io.util;
                                                     /* Problem5 */
import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class MathExpressionParser {
    public static void main(String[] args) {
        String inputFile = "expressions.txt";
        String resultsFile = "results.txt";
        String logFile = "log.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter resultsWriter = new PrintWriter(new FileWriter(resultsFile));
             PrintWriter logWriter = new PrintWriter(new FileWriter(logFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                try {
                    StringTokenizer st = new StringTokenizer(line.replaceAll("\\s+", ""), "+-*/", true);
                    if (st.countTokens() < 3) {
                        throw new NoSuchElementException();
                    }
                    double op1 = Double.parseDouble(st.nextToken());
                    String operator = st.nextToken();
                    double op2 = Double.parseDouble(st.nextToken());
                    double result = 0;

                    switch (operator) {
                        case "+": result = op1 + op2; break;
                        case "-": result = op1 - op2; break;
                        case "*": result = op1 * op2; break;
                        case "/": result = op1 / op2; break;
                        default:
                            throw new UnsupportedOperationException();
                    }
                    resultsWriter.println(line + " = " + result);

                } catch (NoSuchElementException e) {
                    logWriter.println("Error (Missing elements): " + line);
                } catch (NumberFormatException e) {
                    logWriter.println("Error (Invalid number format or unknown operator): " + line);
                } catch (UnsupportedOperationException e) {
                    logWriter.println("Error (Unsupported operation): " + line);
                }
            }

            System.out.println("Expression parsing complete!");
            System.out.println("Check the results.txt and log.txt files in the project root.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File " + inputFile + " not found. Create it at the root of the project.");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}