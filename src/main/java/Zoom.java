import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet{

    int size;
    String message;
    public Zoom(Bandeau bandeau, String mess, int s) {
        super(bandeau);
        this.size = s;
        this.message = mess;
    }

    public Zoom(Bandeau bandeau, String mess, int s, int nbRepetitions) {
        super(bandeau, nbRepetitions);
        this.size = s;
        this.message = mess;
    }

    @Override
    public void actionner() {
        for (int i = 0; i < this.nbRepetitions; i++) {
            this.size += i * 4; //multiplicateur size
            this.bandeau.setFont(new Font(message, Font.BOLD, size));
            bandeau.sleep(300);

        }
    }
}
