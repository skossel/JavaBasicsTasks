import java.text.DecimalFormat;

public class Calculations {
    private static final DecimalFormat CHF_FORMAT = new DecimalFormat("##.00");
    public static void calculationsOfValues(double credit, int runtime, double interestRate) {
        double initial = credit;
        for (int year = 1; year <= runtime; year++) {
            credit = credit * (1 + interestRate / 100);

            System.out.println("| " + year + ".Year" + ":" + " ➡\uFE0F" + "\t" + CHF_FORMAT.format(roundToTwoDigits(credit)) + "CHF" + " |");
        }

        double rateOfReturn = credit - initial;
        System.out.println("\n Du hast in " + runtime + " Jahren folgende Rendite erzielt: " + "\033[0;1m" + CHF_FORMAT.format(roundToTwoDigits(rateOfReturn)) + " \033[0;1m CHF");
    }

    public void calculationsOfValues(CreditDevelopment.UserInputs userInputs) {
        calculationsOfValues(userInputs.credit(), userInputs.runtime(), userInputs.interestRate());
    }

    public static double roundToTwoDigits(double input) {
        return (int) ((input * 20) + 0.5) / 20.0;
    }
}
