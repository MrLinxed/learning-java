package part2;

import java.util.Scanner;

public class Exercise022Reprint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many times?");
        int number = Integer.parseInt(reader.nextLine());

        for(int i = 0; i < number; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
