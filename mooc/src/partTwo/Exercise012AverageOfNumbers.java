package partTwo;

import java.util.Scanner;

public class Exercise012AverageOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while(true) {
            System.out.println("Give a number:");
            double number = Double.parseDouble(reader.nextLine());

            if(number == 0) {
                break;
            }

            sum = sum + number;
            count = count + 1;
        }

        System.out.println("Average of the numbers: " + (sum / count));
    }
}
