package entities;

public class Immagine extends ElementoMultimediale {

    //attributi
    private int luminosita;

    //costruttore
//    public Immagine(int luminosita) {
//        this.luminosita = luminosita;
//    }

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    //metodi
    public void show() {
        System.out.println("Il titolo dell'immagine è: " + getTitolo());
        for (int i = 0; i < getLuminosita(); i++) {
            System.out.println("*");
        }
    }


    public void aumentaLuminosita() {
        this.luminosita++;
        System.out.println("La luminosità è stata aumentata. Ora è:");
        for (int l = 0; l < this.luminosita; l++) {
            System.out.println("*");
        }
    }

    public void diminuisciLuminosita() {
        this.luminosita--;
        System.out.println("La luminosità è stata diminuita. Ora è:");
        for (int l = 0; l < this.luminosita; l++) {
            System.out.println("*");
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

}
