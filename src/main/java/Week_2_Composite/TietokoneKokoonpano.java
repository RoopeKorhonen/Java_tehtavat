package Week_2_Composite;

class TietokoneKokoonpano {
    public static void main(String[] args) {
        // Luodaan erilaisia laiteosia
        YksittainenLaiteosa muistipiiri = new YksittainenLaiteosa("Muistipiiri", 50.0);
        YksittainenLaiteosa prosessori = new YksittainenLaiteosa("Prosesssori", 200.0);
        YksittainenLaiteosa verkkokortti = new YksittainenLaiteosa("Verkkokortti", 30.0);

        // Luodaan koostekomponentteja
        KoosteLaiteosa emolevy = new KoosteLaiteosa("Emolevy");
        emolevy.lisaaLaiteosa(muistipiiri);
        emolevy.lisaaLaiteosa(prosessori);

        KoosteLaiteosa kotelo = new KoosteLaiteosa("Kotelo");
        kotelo.lisaaLaiteosa(emolevy);
        kotelo.lisaaLaiteosa(verkkokortti);

        // Laske kokoonpanon hinta ja tulosta se
        double kokonaishinta = kotelo.haeHinta();
        System.out.println("Kokoonpanon hinta: " + kokonaishinta);

        // Käytä abstraktia tehdasta
        LaiteosaTehdas halpaTehdas = new HalpaLaiteosaTehdas();
        LaiteosaTehdas kallisTehdas = new KallisLaiteosaTehdas();

        // Luo halvan tietokoneen
        Laiteosa halpaKotelo = halpaTehdas.luoKotelo();
        Laiteosa halpaTietokone = halpaTehdas.luoTietokone(halpaKotelo);
        System.out.println("Halvan tietokoneen hinta: " + halpaTietokone.haeHinta());

        // Luo kalliin tietokoneen
        Laiteosa kallisKotelo = kallisTehdas.luoKotelo();
        Laiteosa kallisTietokone = kallisTehdas.luoTietokone(kallisKotelo);
        System.out.println("Kalliin tietokoneen hinta: " + kallisTietokone.haeHinta());
    }
}