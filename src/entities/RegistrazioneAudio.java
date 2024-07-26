package entities;

import interfaces.Play;

public class RegistrazioneAudio extends ElementoMultimediale implements Play {

    //attributi
    private int volume;
    private int durata;

    //costruttore
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    //metodi
    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {
        System.out.println("Il titolo della registrazione audio è: " + getTitolo());
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo());
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


    public int getVolume() {
        return volume;
    }
}
