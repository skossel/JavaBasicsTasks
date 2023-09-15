import java.text.DecimalFormat;
import java.util.Scanner;

public class Guthabenentwicklung {
    public static void main(String[] args) {


        System.out.println(Math.round(7.49999999));

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

                System.out.println(jahr + ".Jahr" + ":" + " " + rundenAufZweiStellen.format(eingabeGuthaben) + "CHF");
        }


        double rendite = eingabeGuthaben - initial;
        System.out.println("\n Du hast in " + eingabelaufzeit + " Jahren folgende Rendite erzielt: " + runden(rendite));
        dasIstEinScanner.close();

    }

    public static double runden(double rendite) {

        //double dasIstEinTest = 12345.8998956654;

        String vonZahlZuBuchstaben = Double.toString(rendite);
        String[] numberParts = vonZahlZuBuchstaben.split("\\.");

        String vorDemKomma = numberParts[0];
        String nachDemKomma = numberParts[1];

        int dritteStelleNachKomma = Integer.parseInt(nachDemKomma.substring(2, 3));
        int zweiteStelleNachKomma = Integer.parseInt(nachDemKomma.substring(1, 2));
        int ersteStelleNachKomma = Integer.parseInt(nachDemKomma.substring(0, 1));

        int ersteStelleVorDemKomma = Integer.parseInt(vorDemKomma);


        if (dritteStelleNachKomma >= 5) {
            zweiteStelleNachKomma++;
            //carryover
        }

        if (zweiteStelleNachKomma == 10 ) {
            ersteStelleNachKomma++;
            zweiteStelleNachKomma = 0;
        }

        if (ersteStelleNachKomma == 10) {
            ersteStelleVorDemKomma++;
            ersteStelleNachKomma = 0;
        }
        System.out.printf("%d.%d%d",ersteStelleVorDemKomma,ersteStelleNachKomma,zweiteStelleNachKomma);

        //double roundedTotal =


        System.out.println("Das ist ein Test für den zweiten Commit");

        return ersteStelleVorDemKomma + ersteStelleNachKomma/10 + zweiteStelleNachKomma/100;




        // public static double rundenAufFuenfRappen(double runden) {
        //     switch ()
        // }





/*
        double[] aufteilungDerBuchstaben = new double[vonZahlZuBuchstaben.length()];

        int anfang = 0;
        for (char charakter : vonZahlZuBuchstaben.toCharArray()) {
            aufteilungDerBuchstaben[anfang++] = Character.getNumericValue(charakter);
        }

        for (double einzelneZahlenAusgaben : aufteilungDerBuchstaben) {
            System.out.println(einzelneZahlenAusgaben);
        }
return 0;

 */


    }



}







