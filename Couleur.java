package exemple;
import bandeau.Bandeau;
import java.awt.*;

//cette classe va permettre de changer la couleur de la police et du fond

public class Couleur extends Effet{

    public void executer(Bandeau bandeau) {
        Font f = bandeau.getFont();
        Color b = bandeau.getBackground();
        Color fo = bandeau.getForeground();

        bandeau.setMessage("Changeons de couleur");
        bandeau.sleep(1000);
        bandeau.setBackground(Color.PINK);//change la couleur du fond
        bandeau.setMessage("Changeons de couleur");
        bandeau.sleep(1000);
        bandeau.setForeground(Color.WHITE);//change la couleur de la police
        bandeau.sleep(1000);
        bandeau.setFont(f);
        bandeau.setForeground(fo);
        bandeau.setBackground(b);
    }

}
