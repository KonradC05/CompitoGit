
import java.util.Scanner;

public class citazioni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int scelta, scelta2 = 1000;

        do {
            System.out.println(
                    "Quale citazione si vuole leggere? \n");
            scelta = input.nextInt();
            String cit = citazioneScelta(scelta);
            System.out.println(cit);

            System.out.println(
                    "\nSi vuole leggere un'altra citazione? \nPremere 1 per effettuare una nuova selezione, altrimenti per concludere premere 9\n");
            scelta2 = input.nextInt();
        } while (scelta2 != 9);

        input.close();
        System.out.println("\nTermine Programma\n");
    }

    private String citazioneScelta(int scelta) {
        String citazione;
        switch (scelta) {
            case 1:
                citazione = "Yzma:\n    Abbassa la leva Kronk!\n    L'altra leva!!";
                break;
            case 2:
                citazione = " ";
                break;
            case 3:
                citazione = " ";
                break;
            default:
                citazione = "Scar:\n    Sono circondato da un branco di Idioti!";
                break;
        }
        return citazione;
    }
}

