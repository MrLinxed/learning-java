import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        // Write your program here
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        System.out.println(message);
    }
}