package Week_2_Composite;
class KallisLaiteosaTehdas implements LaiteosaTehdas {
    @Override
    public Laiteosa luoKotelo() {
        return new YksittainenLaiteosa("Kallis kotelo", 100.0);
    }

    @Override
    public Laiteosa luoTietokone(Laiteosa kotelo) {
        KoosteLaiteosa tietokone = new KoosteLaiteosa("Kallis tietokone");
        tietokone.lisaaLaiteosa(kotelo);
        tietokone.lisaaLaiteosa(new YksittainenLaiteosa("Kallis näytönohjain", 200.0));
        return tietokone;
    }
}