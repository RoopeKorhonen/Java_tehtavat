package Week_2_Composite;
import java.util.ArrayList;
import java.util.List;
class KoosteLaiteosa implements Laiteosa {
    private String nimi;
    private List<Laiteosa> osat = new ArrayList<>();

    public KoosteLaiteosa(String nimi) {
        this.nimi = nimi;
    }

    public void lisaaLaiteosa(Laiteosa laiteosa) {
        osat.add(laiteosa);
    }

    @Override
    public double haeHinta() {
        double kokonaishinta = 0;
        for (Laiteosa laiteosa : osat) {
            kokonaishinta += laiteosa.haeHinta();
        }
        return kokonaishinta;
    }
}