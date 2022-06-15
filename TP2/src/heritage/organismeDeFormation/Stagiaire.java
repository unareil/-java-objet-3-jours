package heritage.organismeDeFormation;

public class Stagiaire extends Personne{
    private String dateNaissance;
    private String adresse;
    private int codePostal;
    private String City;

    public Stagiaire(String nom, String prenom, int telephone, String dateNaissance, String adresse, int codePostal, String city) {
        super(nom, prenom, telephone);
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        City = city;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stagiaire{");
        sb.append("dateNaissance='").append(dateNaissance).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", codePostal=").append(codePostal);
        sb.append(", City='").append(City).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
