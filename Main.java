package exemple;
import bandeau.Bandeau;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
            Bandeau b = new Bandeau();
            Scenario s = new Scenario(b);
            Rotation r = new Rotation("Je tooooouuuurne !");
            Couleur c = new Couleur();
            ZoomNeg zn = new ZoomNeg();
            s.ajouterEffet(zn, 2);
            s.ajouterEffet(r, 2);
            s.ajouterEffet(c, 2);
            s.lancerScenario();


        }

}
