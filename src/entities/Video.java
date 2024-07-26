package entities;

import interfaces.Play;

public class Video extends ElementoMultimediale implements Play {

    //attributi
//    private int volume;
    private int luminosita;
    private int durata;

    //costruttore
    public Video(String titolo, int durata, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
//        this.volume = volume;
    }

    //metodi

//    public void alzaVolume() {
//        volume++;
//    }
//
//    public void abbassaVolume() {
//        volume--;
//    }

    public void aumentaLuminosità() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
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

    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void alzaVolume() {

    }
}
