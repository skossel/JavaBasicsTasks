import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner derScanner = new Scanner(System.in);

        System.out.println("Geben Sie ihren Namen ein: ");
        String eingabe = derScanner.nextLine();
        System.out.println("Hallo " + eingabe + " , wir begrüssen Sie ganz herzlich!");
    }
}