package part2;

public class Exercise034AdvancedAstrology {
    public static void printSpaces(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        int width = height * 2 - 1;
        for(int i = 1; i <= height; i++) {
            printSpaces(width / 2 - i + 1);
            printStars(1 + (i * 2) - 2);
            System.out.println();
        }

        for(int i = 0; i < 2; i++) {
            printSpaces(width / 2 - 1);
            printStars(3);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        christmasTree(6);
    }
}
