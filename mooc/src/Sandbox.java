import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        // Write your program here
        System.out.println("Hello World");


        Scanner scanner = new Scanner(System.in);
        // Commenting this out, because it's annoying to always have to write something when testing :P
        /* System.out.println("Write a message: ");
        String message = scanner.nextLine();
        System.out.println(message); */

        String message2 = "Hello world!";
        System.out.println(message2);
        System.out.println("message2");

        System.out.println("Hello " + "world!");
        System.out.println(message2 + " ... and the universe!");

        String start = "My name is ";
        String end = ", James Bond";

        System.out.println(start + "Bond" + end);
    }
}