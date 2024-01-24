package FactoryMethod;

public class OpettajaKolmas extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Mehukeitto();
    }
}
