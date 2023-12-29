package partOne;

import java.util.Scanner;

public class Exercise012DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("You gave the number " + value);
    }
}
