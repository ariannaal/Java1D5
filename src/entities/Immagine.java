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
        System.out.println("L'immagine è " + getTitolo());
        for (int i = 0; i < getLuminosita(); i++) {
            System.out.println("*");

        }
    }

    public void aumentaLuminosità() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public int getLuminosita() {
        return luminosita;
    }

}
