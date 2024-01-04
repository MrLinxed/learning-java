package part2;

public class Exercise024FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        for(int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
