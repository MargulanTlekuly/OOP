package pr5.io.app;
                                     /* Problem 4 */
import java.io.*;
import java.util.Random;

public class SensorSimulator {
    public static void main(String[] args){
        String fileName = "sensor.bin";

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            Random random = new Random();
            for(int i=0; i<60; i++){
                double temp = 15.0 + (20.0* random.nextDouble());
                dos.writeDouble(temp);
            }
            System.out.println("Step 1: 60 values successfully written to file " + fileName);
        }catch (IOException e){
            System.out.println("Error writing: " + e.getMessage());
        }
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            int recordNumber = 30;
            long position = (recordNumber - 1) * 8L;

            raf.seek(position);
            raf.writeDouble(999.9);
            System.out.println("Step 2: Record 30 replaced with 999.9 (simulate failure)");
        } catch (IOException e) {
            System.out.println("Error patching file: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            double sum = 0;
            double max = Double.MIN_VALUE;
            int count = 0;

            while (dis.available() > 0) {
                double currentTemp = dis.readDouble();
                sum += currentTemp;

                if (currentTemp > max) {
                    max = currentTemp;
                }
                count++;
            }

            double average = sum / count;

            System.out.println("\n--- READING RESULTS ---");
            System.out.println("Total number of entries read: " + count);
            System.out.printf("Average temperature: %.2f\n", average);
            System.out.println("Maximum temperature: " + max);

            if (max == 999.9) {
                System.out.println("Success! The faulty jump (999.9) has been found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }
    }
}
