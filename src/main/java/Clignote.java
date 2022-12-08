import bandeau.Bandeau;

import java.awt.*;

public class Clignote extends Effet{

    Color color1;
    Color color2;

    public Clignote(Bandeau bandeau, Color col1, Color col2) {
        super(bandeau);
        this.color1 = col1;
        this.color2 = col2;
        this.nbRepetitions = 0;
    }

    public Clignote(Bandeau bandeau, Color col1, Color col2, int nbRepetitions) {
        super(bandeau, nbRepetitions);
        this.color1 = col1;
        this.color2 = col2;

    }

    @Override
    public void actionner() {
        for (int i = 0; i < this.nbRepetitions; i++) {
            if(i%2 == 0) {
                this.bandeau.setForeground(color1);
                this.bandeau.sleep(300);
            }
            else {
                this.bandeau.setForeground(color2);
                this.bandeau.sleep(300);
            }
        }

    }
}
