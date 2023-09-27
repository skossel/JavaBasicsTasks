import java.text.DecimalFormat;
import java.util.Scanner;

public class CreditDevelopment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat roundToTwoDigits = new DecimalFormat("##.00");

        System.out.println("Welcome to the interest calculator you can trust\n");

        System.out.println("Credit:");
        double inputCredit = scanner.nextDouble();

        double initial = inputCredit;

        System.out.println("Runtime:");
        int inputRuntime = scanner.nextInt();

        System.out.println("Interest rate:");
        double interestRate = scanner.nextDouble();


        for (int year = 1; year <= inputRuntime; year++) {
                inputCredit = inputCredit * (1 + interestRate / 100);

                System.out.println("| " + year + ".Year" + ":" + " ➡\uFE0F" + "\t" + roundToTwoDigits.format(roundToTwoDigits(inputCredit)) + "CHF" + " |");
        }




        double rateOfReturn = inputCredit - initial;
        System.out.println("\n Du hast in " +  inputRuntime + " Jahren folgende Rendite erzielt: " + "\033[0;1m" + roundToTwoDigits.format(roundToTwoDigits(rateOfReturn)) + "CHF");
        scanner.close();


    }


    public static double roundToTwoDigits(double input) {
        return (int) ((input * 20)+0.5)/20.0;
    }

}



//1.) seperate method input und structure return (record)
//2.) seperate method for calculation (record)



