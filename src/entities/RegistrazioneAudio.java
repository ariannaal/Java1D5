package entities;

import interfaces.Play;

public class RegistrazioneAudio extends ElementoMultimediale implements Play {

    //attributi
//    private int volume;
    private int durata;

    //costruttore
    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo);
//        this.volume = volume;
        this.durata = durata;
    }

    //metodi

//    public void abbassaVolume() {
//        volume--;
//    }
//
//    public void alzaVolume() {
//        volume++;
//    }

//    public int getVolume() {
//        return volume;
//    }

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
