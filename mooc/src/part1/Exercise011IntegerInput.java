package part1;

import java.util.Scanner;

public class Exercise011IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number " + value);
    }
}
