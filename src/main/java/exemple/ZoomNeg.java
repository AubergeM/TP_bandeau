package exemple;

import bandeau.Bandeau;
import java.awt.*;

//cette classe va permettre de dézoomer le texte
public class ZoomNeg extends Effet{

    public void executer(Bandeau bandeau) {

        bandeau.setMessage("On va dézoomer");
        bandeau.sleep(1000);
        bandeau.setMessage("Je m'éloiiiigne!");
        for (int i = 55; i > 10; i -= 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.sleep(1000);
    }

}
