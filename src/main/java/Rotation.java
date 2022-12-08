import bandeau.Bandeau;

public class Rotation extends Effet {

    float rot;

    public Rotation(Bandeau bandeau) {
        super(bandeau);
    }

    public Rotation(Bandeau bandeau, int nbRepetitions) {
        super(bandeau, nbRepetitions);
    }

    @Override
    public void actionner() {

        for (int i = 0; i < this.nbRepetitions; i++) {
            this.rot += Math.PI /4;
            this.bandeau.setRotation(rot);
            this.bandeau.sleep(500);
        }
    }
}
