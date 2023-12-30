package partOne;

import java.util.Scanner;

public class Exercise026Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
