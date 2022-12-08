import bandeau.Bandeau;
import java.awt.*;

public class BackgroundColor extends Effet{

    Color colorBg;

    public BackgroundColor(Bandeau bandeau, Color color) {
        super(bandeau);
        this.colorBg = color;
    }

    @Override
    public void actionner() {
        this.bandeau.setBackground(colorBg);
    }
}
