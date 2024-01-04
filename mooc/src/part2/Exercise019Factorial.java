package part2;

import java.util.Scanner;

public class Exercise019Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a number? ");
        int number = Integer.parseInt(reader.nextLine());
        int factorial = 1;

        for(int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
