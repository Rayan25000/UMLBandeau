import bandeau.Bandeau;

import java.awt.*;

public class ForegroundColor extends Effet{

    Color colorText;
    public ForegroundColor(Bandeau bandeau, Color color) {
        super(bandeau);
        this.colorText = color;
    }

    @Override
    public void actionner() {
        this.bandeau.setForeground(colorText);
    }
}
