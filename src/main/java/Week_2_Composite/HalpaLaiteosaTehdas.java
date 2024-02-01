package Week_2_Composite;
class HalpaLaiteosaTehdas implements LaiteosaTehdas {
    @Override
    public Laiteosa luoKotelo() {
        return new YksittainenLaiteosa("Halpa kotelo", 30.0);
    }

    @Override
    public Laiteosa luoTietokone(Laiteosa kotelo) {
        KoosteLaiteosa tietokone = new KoosteLaiteosa("Halpa tietokone");
        tietokone.lisaaLaiteosa(kotelo);
        tietokone.lisaaLaiteosa(new YksittainenLaiteosa("Halpa näytönohjain", 50.0));
        return tietokone;
    }
}
