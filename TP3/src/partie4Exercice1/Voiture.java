package partie4Exercice1;

import java.awt.*;

public class Voiture {
    private long num_serie;
    private String immatriculation;
    private String marque;
    private Color couleur;
    private int année;
    private Individu proprietaire;

    public Voiture(long num_serie, String immatriculation, String marque, Color couleur, int année) {
        this.num_serie = num_serie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.année = année;
    }

    public void demarrer() {
        System.out.println("démarre");
    }

    public void klaxonner() {
        System.out.println("klaxonne");
    }

    public void conduire() {
        System.out.println("conduit");
    }

    public void arreter() {
        System.out.println("arrêt");
    }


    public long getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(long num_serie) {
        this.num_serie = num_serie;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getAnnée() {
        return année;
    }

    public void setAnnée(int année) {
        this.année = année;
    }

    public Individu getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voiture{");
        sb.append("num_serie=").append(num_serie);
        sb.append(", immatriculation='").append(immatriculation).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", couleur=").append(couleur);
        sb.append(", année=").append(année);
        sb.append(", proprietaire=").append(proprietaire);
        sb.append('}');
        return sb.toString();
    }
}
