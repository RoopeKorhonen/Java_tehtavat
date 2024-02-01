package Week_2_Composite;
class YksittainenLaiteosa implements Laiteosa {
    private String nimi;
    private double hinta;

    public YksittainenLaiteosa(String nimi, double hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public double haeHinta() {
        return hinta;
    }
}