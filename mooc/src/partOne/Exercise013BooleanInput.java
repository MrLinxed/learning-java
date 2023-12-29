package partOne;

import java.util.Scanner;

public class Exercise013BooleanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean value = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("True or false? " + value);
    }
}
