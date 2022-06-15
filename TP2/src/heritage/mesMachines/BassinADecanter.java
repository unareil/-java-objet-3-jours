package heritage.mesMachines;

public class BassinADecanter {
    private int capaciteHL;

    public BassinADecanter(int capaciteHL) {
        this.capaciteHL = capaciteHL;
    }

    public int getCapaciteHL() {
        return capaciteHL;
    }

    public void setCapaciteHL(int capaciteHL) {
        this.capaciteHL = capaciteHL;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BassinADecanter{");
        sb.append("capaciteHL=").append(capaciteHL);
        sb.append('}');
        return sb.toString();
    }
}
