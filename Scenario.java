package exemple;
import java.util.HashMap;
import bandeau.Bandeau;
import java.util.*;

public class Scenario {
    private HashMap<Effet, Integer> lesEffets;
    private Bandeau bandeau;

    public Scenario(Bandeau bandeau){
        this.bandeau = bandeau;
        this.lesEffets = new HashMap<>();
    }

    public void ajouterEffet(Effet e, int nbRep){
        lesEffets.put(e, nbRep);
    }

    public void lancerScenario(){
        for(Map.Entry<Effet, Integer> entry : this.lesEffets.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                entry.getKey().executer(bandeau);
            }
        }
        bandeau.close();
    }
}
