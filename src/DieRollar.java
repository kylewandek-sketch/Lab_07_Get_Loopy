import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playAgain = "y";

        while (playAgain.equals("y")) {
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 0;
            boolean gotTriple = false;

            while (gotTriple == false) {
                rollCount = rollCount + 1;

                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    gotTriple = true;
                }
            }

            System.out.println();
            System.out.println("Triple found in " + rollCount + " rolls!");
            System.out.println();
            System.out.print("Roll again? (y/n): ");
            playAgain = scanner.nextLine();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
