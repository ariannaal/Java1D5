package entities;

import interfaces.Play;

public class Video extends ElementoMultimediale implements Play {

    //attributi
    private int volume;
    private int luminosita;
    private int durata;

    //costruttore
    public Video(String titolo, int durata, int luminosita, int volume) {
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }

    //metodi
    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {
        System.out.println("Il titolo del video è: " + getTitolo());
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(this.getTitolo());
        }
        for (int l = 0; l < getLuminosita(); l++) {
            System.out.println("*");
        }
        for (int v = 0; v < getVolume(); v++) {
            System.out.println("!");
        }

    }

    @Override
    public void abbassaVolume() {
        this.volume--;
        System.out.println("Il volume è stato abbassato. Ora è:");
        for (int v = 0; v < this.volume; v++) {
            System.out.println("!");
        }
    }

    @Override
    public void alzaVolume() {
        this.volume++;
        System.out.println("Il volume è stato alzato. Ora è:");
        for (int v = 0; v < this.volume; v++) {
            System.out.println("!");
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
}
