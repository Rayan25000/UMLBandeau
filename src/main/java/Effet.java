import bandeau.Bandeau;

import java.awt.*;

public abstract class Effet {

    Bandeau bandeau;
    int nbRepetitions;

    public Effet(Bandeau bandeau) {
        this.bandeau = bandeau;
        this.nbRepetitions = 0;
    }

    public Effet(Bandeau bandeau, int nbRepetitions) {
        this.bandeau = bandeau;
        this.nbRepetitions = nbRepetitions;
    }

    public void setNbRepetitions(int nbRepetitions) {
        this.nbRepetitions = nbRepetitions;
    }

    public abstract void actionner();
}
