
import java.util.Scanner;

public class citazioni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int scelta, scelta2 = 1000;

        do {
            System.out.println(
                    "Quale citazione si vuole leggere? \n Premere 1 per Yzma, 2 per Kuzko, 3 per Rafiki");
            scelta = input.nextInt();
            String cit = citazioneScelta(scelta);
            System.out.println(cit);

            System.out.println(
                    "\nSi vuole leggere un'altra citazione? \nPremere 1 per effettuare una nuova selezione, \naltrimenti per concludere il programma premere 9\n");
            scelta2 = input.nextInt();
        } while (scelta2 != 9);

        input.close();
        System.out.println("\nProgramma Terminato\n");
    }

    private static String citazioneScelta(int scelta) {
        String citazione;
        switch (scelta) {
            case 1:
                citazione = "Yzma:\n   Abbassa la leva Kronk!\n L'altra leva!!"
                + "\n Ma perchè dobbiamo avere due leve? ";
                break;
            case 2:
                citazione = "Kuzko:\n   Ah, a proposito, sei licenziata."
                + "\nYzma:\n   Licenziata? Co-co-come sarebbe a dire \"licecenziata\"? "
                + "\nKuzko:\n   Ehm, come posso spiegartelo?\n Ti sollevo dall'incarico, sei stata dimissionata, "
                + "rientri nella riduzione del personale, divergenza di intenti,\n conflito di interessi...\n"
                + " Scegli la tua versione, ne ho altre!";
                break;
            case 3:
                citazione = "Simba:\n   Ahi! Che male! Perche mi hai colpito?\n"
                + "Rafiki:\n   Non ha importanza: ormai è passato. hahahahah\n"
                + "Simba:\n   Sì, ma continua a fare male...\n"
                + "Rafiki:\n   Oh, sì, il passato può fare male.\n"
                + " Ma a mio modo di vedere dal passato puoi scappare... oppure imparare qualcosa.";
                break;
            default:
                citazione = "Scar:\n   Sono circondato da un branco di Idioti!";
                break;
        }
        return citazione;
    }
}

