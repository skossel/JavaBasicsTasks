import java.text.DecimalFormat;
import java.util.Scanner;

public class Guthabenentwicklung {
    public static void main(String[] args) {

        Scanner dasIstEinScanner = new Scanner(System.in);
        DecimalFormat rundenAufZweiStellen = new DecimalFormat("##.00");

        System.out.println("Willkommen beim Zinsrechner Ihres Vertrauens\n");

        System.out.println("Guthaben:");
        double eingabeGuthaben = dasIstEinScanner.nextDouble();

        double initial = eingabeGuthaben;

        System.out.println("Laufzeit:");
        int eingabelaufzeit = dasIstEinScanner.nextInt();

        System.out.println("Zinssatz:");
        double zinssatz = dasIstEinScanner.nextDouble();


        for (int jahr = 1; jahr <= eingabelaufzeit; jahr++) {
                eingabeGuthaben = eingabeGuthaben * (1 + zinssatz / 100);

                System.out.println("| " + jahr + ".Jahr" + ":" + " ➡\uFE0F" + "\t" + rundenAufZweiStellen.format(roundToTwoDigits(eingabeGuthaben)) + "CHF" + " |");
        }




        double rendite = eingabeGuthaben - initial;
        System.out.println("\n Du hast in " +  eingabelaufzeit + " Jahren folgende Rendite erzielt: " + "\033[0;1m" + rundenAufZweiStellen.format(roundToTwoDigits(rendite)) + "CHF");
        dasIstEinScanner.close();


    }

    public static double roundToTwoDigits(double input) {
        return (int) ((input * 20)+0.5)/20.0;
    }

}







