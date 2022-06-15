package partie4Exercice2;

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Set;

public class Mission {
    private String nom;
    private String description;
    private int nbHeurePrevues;
    private Intervenant executant;
    private Hashtable<LocalDate, Integer> releveHoraire = new Hashtable<>();
    Set<LocalDate> setOfKeys = releveHoraire.keySet();

    public Mission(String nom, String description, int nbHeurePrevues, Intervenant executant) {
        this.nom = nom;
        this.description = description;
        this.nbHeurePrevues = nbHeurePrevues;
        this.executant = executant;
    }

    public void ajoutReleve(LocalDate laDate, int nbreHeures) {
        releveHoraire.put(laDate, nbreHeures);
    }

    public Intervenant getExecutant() {
        return executant;
    }

    public Hashtable<LocalDate, Integer> getReleveHoraire() {
        return releveHoraire;
    }

    public double nbHeuresEffectues() {
        int totalReleveHoraire = 0;
        for (LocalDate key : setOfKeys) {
            totalReleveHoraire += releveHoraire.get(key);
        }
        return totalReleveHoraire;
    }
}
