package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise001ThirdElement {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while(true) {
            String name = reader.nextLine();

            if(name.isEmpty()) {
                break;
            }

            wordList.add(name);
        }

        System.out.println(wordList.get(2));
    }
}
