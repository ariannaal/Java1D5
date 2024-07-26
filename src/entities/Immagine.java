package entities;

public class Immagine extends ElementoMultimediale {

    //attributi
    private int luminosita;

    //costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    //metodi
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
