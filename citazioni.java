
import java.util.Scanner;

public class startingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int scelta, scelta2 = 1000;

        do {
            System.out.println(
                    "Quale citazione si vuole leggere? \n");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }
            System.out.println(" ");

            System.out.println(
                    "\nSi vuole leggere un'altra citazione? \nPremere 1 per effettuare una nuova selezione, altrimenti per concludere premere 9\n");
            scelta2 = input.nextInt();
        } while (scelta2 != 9);

        input.close();
        System.out.println("\nTermine Programma\n");
    }

    private String citazione1() {
        String citazione1;
        citazione1 = "Yzma:\n Abbassa la leva Kronk!\n  L'altra leva!!";
        return citazione1;
    }
}

