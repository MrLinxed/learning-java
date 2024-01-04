package part2;

import java.util.Scanner;

public class Exercise006AreWeThereYet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(reader.nextLine());
            if(number == 4) {
                break;
            }
        }
    }
}
