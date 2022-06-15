package partie4Exercice2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Projet {
    private String nom;
    private LocalDate debut;
    private LocalDate fin;
    private int prixFactureMO;
    private ArrayList<Mission> missions;


    public Projet(String nom, LocalDate debut, LocalDate fin, int prixFactureMO, ArrayList<Mission> missions) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFactureMO = prixFactureMO;
        this.missions = missions;
    }

    public double cumulCoutMo() {
        double totalCumulCout = 0;
        for (Mission mission : missions) {

            totalCumulCout += mission.getExecutant().getTauxHoraire() * mission.nbHeuresEffectues();

        }
        return totalCumulCout;
    }

    public double margeBruteCourante() {

        return prixFactureMO - cumulCoutMo();


    }
}
