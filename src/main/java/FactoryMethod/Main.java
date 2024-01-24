package FactoryMethod;
/* Testi committiin ja puskuun */
public class Main {

    public static void main(String[] args) {
        Opettaja opettaja = new Opettaja();
        opettaja.aterioi();

        OpettajaToinen toinenOpettaja = new OpettajaToinen();
        toinenOpettaja.aterioi();

        OpettajaKolmas kolmasOpettaja = new OpettajaKolmas();
        kolmasOpettaja.aterioi();
    }
}
