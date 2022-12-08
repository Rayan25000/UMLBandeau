import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //premier bandeau
        Bandeau bandeau1 = new Bandeau();

        //liste de 6 effets pour le scenario 1
        ArrayList<Effet> listEffet1 = new ArrayList<Effet>();
        listEffet1.add(new BackgroundColor(bandeau1,new Color(255)));
        listEffet1.add(new ForegroundColor(bandeau1,new Color(200,50,211)));
        listEffet1.add(new BackgroundColor(bandeau1,new Color(100)));
        listEffet1.add(new Zoom(bandeau1,bandeau1.getMessage(),15,6));
        listEffet1.add(new Rotation(bandeau1,8));
        listEffet1.add(new Clignote(bandeau1,new Color(100,50,10),new Color(200,200,50),8));



        //Initialisation avec une liste d'effet directement
        Scenario scenario1 = new Scenario(bandeau1, listEffet1);
        //Possibilité d'utiliser la méthode addEffetInScenario()
        scenario1.addEffetInScenario(new BackgroundColor(bandeau1, new Color(100,100,100)));
        //Démarrage scénario
        scenario1.initScenario();
        scenario1.executeScenario(2000);

    }
}
