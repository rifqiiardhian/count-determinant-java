import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getDeterminant();
    }

    private static void getDeterminant() {
        double a, b, c;
        int loop = 0;
        String inCheck;
        Scanner input = new Scanner(System.in);

        System.out.println("Get Determinant Program :D");
        System.out.println("--------------------------");
        System.out.println("D = b2 - 2ac");
        System.out.println("--------------------------");

        do {
            loop++;

            System.out.println("\nInput data:");

            System.out.print("a = ");
            a = input.nextDouble();

            System.out.print("b = ");
            b = input.nextDouble();

            System.out.print("c = ");
            c = input.nextDouble();

            countDeterminant(a, b, c);

            System.out.print("Count determinant again? [y/n]: ");
            inCheck = input.next();

            if (Objects.equals(inCheck, "n")) {
                System.out.println("Thanks :)");
                loop = 0;
            }
        } while (loop > 0);
    }

    private static void countDeterminant(double a, double b, double c) {
        double res;

        res = Math.pow(b, 2) - (2 * a * c);

        System.out.println("D = " +res);
    }
}