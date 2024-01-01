package partTwo;

import java.util.Scanner;

public class Exercise002SquareRootOfSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int inputOne = Integer.parseInt(reader.nextLine());
        int inputTwo = Integer.parseInt(reader.nextLine());
        int sum = inputOne + inputTwo;
        double squareRoot = Math.sqrt(sum);

        System.out.println((int)squareRoot);
    }
}
