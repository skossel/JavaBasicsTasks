import java.util.Scanner;

public class CreditDevelopment {
    public record UserInputs(double credit, int runtime, double interestRate) {}

    public static void main(String[] args) {

        UserInputs userInputs = askForUserInputs();
        Calculations calculations = new Calculations();
        calculations.calculationsOfValues(userInputs);
    }

    private static UserInputs askForUserInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the interest calculator you can trust\n");

        System.out.println("Credit:");
        final double credit = scanner.nextDouble();


        System.out.println("Runtime:");
        final int runtime = scanner.nextInt();

        System.out.println("Interest rate:");
        final double interestRate = scanner.nextDouble();
        scanner.close();

        return new UserInputs(credit, runtime, interestRate);
    }
}



