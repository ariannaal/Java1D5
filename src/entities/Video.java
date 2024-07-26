package entities;

import interfaces.Play;

public class Video extends ElementoMultimediale implements Play {

    //attributi
    private int volume;
    private int luminosita;
    private int durata;

    //costruttore
//    public Video(int durata, int volume) {
//        this.volume = volume;
//        this.durata = durata;
//    }

    public Video(String titolo, int durata, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }

    //metodi


    public void aumentaLuminosità() {
        this.luminosita++;
    }

    public void diminuisciLuminosita() {
        this.luminosita--;
    }

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
        System.out.println("Video " + getTitolo());
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(this.getTitolo());
        }
        for (int v = 0; v < getVolume(); v++) {
            System.out.println("!");
        }
        for (int l = 0; l < getLuminosita(); l++) {
            System.out.println("*");
        }

    }

    @Override
    public void abbassaVolume() {
        this.volume--;
        System.out.println("Il volume abbassato è " + this.volume);

    }

    @Override
    public void alzaVolume() {
        this.volume++;
        System.out.println("Il volume alzato è " + this.volume);

    }
}
