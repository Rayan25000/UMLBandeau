import bandeau.Bandeau;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Scenario  {

    Bandeau bandeau;
    ArrayList<Effet> listEffets = new ArrayList<>();

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public Scenario(Bandeau bd, ArrayList<Effet> listE) {
            this.bandeau = bd;
            this.listEffets = listE;
    }

    public void addEffetInScenario(Effet effet){
        this.listEffets.add(effet);
    }

    public void initScenario(){
        bandeau.setMessage("Le scenario va commencer...");
        bandeau.sleep(2000);
        bandeau.setMessage("Action !");
    }
    public void executeScenario( int nbMilliSec){
        for (Effet effet : listEffets) {
            effet.actionner();
            bandeau.sleep(nbMilliSec);
        }
        bandeau.close();
    }



}
