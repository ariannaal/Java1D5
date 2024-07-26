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
        System.out.println("Registrazione audio " + getTitolo());
        for (int i = 0; i < getDurata(); i++) {
            System.out.println("!");
        }
        for (int j = 0; j < volume; j++) {
            System.out.println("*");
        }
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
        System.out.println("Il volume abbassato è " + volume--);
    }

    @Override
    public void alzaVolume() {
        this.volume++;
        System.out.println("il volume alzato è " + volume++);

    }

}
