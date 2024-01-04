package part2;

import java.util.Scanner;

public class Exercise014Counting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int countInput = Integer.parseInt(reader.nextLine());
        for(int i = 0; i <= countInput; i++) {
            System.out.println(i);
        }
    }
}
