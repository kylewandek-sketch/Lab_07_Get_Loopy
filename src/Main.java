public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: Count up by 1 from 0 to 30");
        for (int i = 0; i <= 30; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 2: Count down by 1 from 30 to 0");
        for (int i = 30; i >= 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 3: Count up by 3 from 0 to 18");
        for (int i = 0; i <= 18; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 4: Count down by 2 from 10 to 0");
        for (int i = 10; i >= 0; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 5: Growing triangle");
        for (int row = 1; row <= 5; row = row + 1) {
            for (int col = 1; col <= row; col = col + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Task 6: Shrinking triangle");
        for (int row = 5; row >= 1; row = row - 1) {
            for (int col = 1; col <= row; col = col + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Task 7: Square");
        for (int row = 1; row <= 5; row = row + 1) {
            for (int col = 1; col <= 5; col = col + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
