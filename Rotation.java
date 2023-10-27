package exemple;

import bandeau.Bandeau;
import java.awt.*;

//cette classe va permettre de faire tourner le texte et de l'aggrandir en même temps

public class Rotation extends Effet{
    private String mes;

    public Rotation(String mes) {
        this.mes = mes;
    }

    public void executer(Bandeau bandeau) {
        bandeau.setMessage(mes);
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + 2*i));
            bandeau.setRotation(i*Math.PI / 2.0f);
            bandeau.sleep(100);
            bandeau.setRotation((i+1)*Math.PI / 2.0f);
            bandeau.setRotation(0.0f);
            bandeau.sleep(100);
        }
    }
}
