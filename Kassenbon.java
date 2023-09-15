import java.text.DecimalFormat;
import java.util.Scanner;

public class Kassenbon {
    public static void main(String[] args) {

        //Initialisierung
        Scanner dasIstDerScanner = new Scanner(System.in);
        DecimalFormat rundenAufZweiStellen = new DecimalFormat("##.00");

        //Anzahl in Terminal abfragen
        System.out.println("Anzahl Würste?");
        int eingabeWurst = dasIstDerScanner.nextInt();

        System.out.println("Anzahl Käse?");
        int eingabeKaese = dasIstDerScanner.nextInt();

        System.out.println("Anzahl Brote?");
        int eingabeBrot = dasIstDerScanner.nextInt();

        System.out.println("Anzahl DVDs?");
        int eingabeDVD = dasIstDerScanner.nextInt();

        dasIstDerScanner.close();

        //Gesamtpreis mithilfe vom Einzelpreis berechnen
        double eineWurst = 4.20;
        double preisWuerste = eingabeWurst * eineWurst;

        double einKaese = 2.30;
        double preisKaese = eingabeKaese * einKaese;

        double einBrot = 2.10;
        double preisBrote = eingabeBrot * einBrot;

        double eineDVD = 12.00;
        double preisDVDs = eingabeDVD * eineDVD;


        //Ausgabe der einzelnen Produkte
        System.out.println("Artikel\t" + "Anzahl\t" + "Einzelpreis\t" + "Gesamtpreis");
        System.out.println("Wurst\t" + eingabeWurst + "x  \t" + rundenAufZweiStellen.format(eineWurst) + " CHF\t" + rundenAufZweiStellen.format(preisWuerste) + " CHF");
        System.out.println("Käse\t" + eingabeKaese + "x  \t" + rundenAufZweiStellen.format(einKaese) + " CHF\t" + rundenAufZweiStellen.format(preisKaese) + " CHF");
        System.out.println("Brot\t" + eingabeBrot + "x  \t" + rundenAufZweiStellen.format(einBrot) + " CHF\t" + rundenAufZweiStellen.format(preisBrote) + " CHF");
        System.out.println("DVD\t" + eingabeDVD + "x  \t" + rundenAufZweiStellen.format(eineDVD) + " CHF\t" + rundenAufZweiStellen.format(preisDVDs) + " CHF");


        //Ausgabe des Gesamtpreises aller Produkte
        System.out.println("-------------------------------------");
        double gesamtPreis = preisWuerste + preisKaese + preisBrote + preisDVDs;
        System.out.println("Gesamt\t\t" + rundenAufZweiStellen.format(gesamtPreis) + "CHF");
    }
}
