package part1;

import java.util.Scanner;

public class Exercise027Adulthood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
    }
}
