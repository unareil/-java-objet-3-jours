package src.heritage.mesMachines;

public class PompeAGravitation {
    private int debit;
    private boolean eauOperationnelle;

    public PompeAGravitation(int debit, boolean eauOperationnelle) {
        this.debit = debit;
        this.eauOperationnelle = eauOperationnelle;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public boolean isEauOperationnelle() {
        return eauOperationnelle;
    }

    public void setEauOperationnelle(boolean eauOperationnelle) {
        this.eauOperationnelle = eauOperationnelle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PompeAGravitation{");
        sb.append("debit=").append(debit);
        sb.append(", eauOperationnelle=").append(eauOperationnelle);
        sb.append('}');
        return sb.toString();
    }
}
