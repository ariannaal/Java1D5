import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("cosa vuoi creare? (scrivi: audio, immagine, video)");
            String tipologia = scanner.nextLine();


            switch (tipologia) {
                case "audio":
                    System.out.println("Inserisci il titolo dell'audio (elemento nr. " + (i + 1) + ")");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci la durata della registrazione audio (elemento nr. " + (i + 1) + ")");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume della registrazione audio (elemento nr. " + (i + 1) + ")");
                    int volumeA = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new RegistrazioneAudio(titolo, durata, volumeA);
                    break;

                case "immagine":
                    System.out.println("Inserisci il titolo dell'immagine (elemento nr. " + (i + 1) + ")");
                    String titoloI = scanner.nextLine();
                    System.out.println("Inserisci la luminosità dell'immagine (elemento nr. " + (i + 1) + ")");
                    int luminositaIm = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Immagine(titoloI, luminositaIm);
                    break;

                case "video":
                    System.out.println("Inserisci il titolo del video (elemento nr. " + (i + 1) + ")");
                    String titoloV = scanner.nextLine();
                    System.out.println("Inserisci la durata del video (elemento nr. " + (i + 1) + ")");
                    int durataV = scanner.nextInt();
                    System.out.println("Inserisci la luminosità del video (elemento nr. " + (i + 1) + ")");
                    int luminositaV = scanner.nextInt();
                    System.out.println("Inserisci il volume del video (elemento nr. " + (i + 1) + ")");
                    int volumeV = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Video(titoloV, durataV, luminositaV, volumeV);
                    break;
                default:
                    System.out.println("L'elemento inserito non è valido. Inserire una tra le seguenti opzioni: immagine, audio, video.");
                    i--;
                    break;
            }

        }

        while (true) {

            System.out.println("Scegliere un elemento da 1 a 5 da eseguire o 0 per terminare.");

            int oggetto = scanner.nextInt();
            scanner.nextLine();

            if (oggetto == 0) {
                System.out.println("Termino...");
                break;
            }

            if (oggetto < 0 || oggetto > 5) {
                System.out.println("Numero selezionato non valido. Seleziona un numero che sia compreso tra 0 e 5.");
            }

            ElementoMultimediale elementoCorrente = elementi[oggetto - 1];

            if (elementoCorrente instanceof Video) {
                ((Video) elementoCorrente).play();
                System.out.println("Vuoi cambiare volume?");

            }

            if (elementoCorrente instanceof RegistrazioneAudio) {
                ((RegistrazioneAudio) elementoCorrente).play();
            }

            if (elementoCorrente instanceof Immagine) {
                ((Immagine) elementoCorrente).show();
            }

        }
    }
}