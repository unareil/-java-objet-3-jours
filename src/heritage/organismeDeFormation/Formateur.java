package src.heritage.organismeDeFormation;

public class Formateur extends Personne {
    static private int nombreIntervenant;
    private int numeroIntervenant;
    private int dateDeCreation;

    public Formateur(String nom, String prenom, int telephone, int numeroIntervenant, int dateDeCreation) {
        super(nom, prenom, telephone);
        this.numeroIntervenant = numeroIntervenant;
        this.dateDeCreation = dateDeCreation;
    }

    public int getNumeroIntervenant() {
        return numeroIntervenant;
    }

    public void setNumeroIntervenant(int numeroIntervenant) {
        this.numeroIntervenant = numeroIntervenant;
    }

    public int getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(int dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public int getNombreIntervenant() {
        return nombreIntervenant;
    }

    public void setNombreIntervenant(int nombreIntervenant) {
        this.nombreIntervenant = nombreIntervenant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Formateur{");
        sb.append("numeroIntervenant=").append(numeroIntervenant);
        sb.append(", dateDeCreation=").append(dateDeCreation);
        sb.append(", nombreIntervenant=").append(nombreIntervenant);
        sb.append('}');
        return sb.toString();
    }
}
