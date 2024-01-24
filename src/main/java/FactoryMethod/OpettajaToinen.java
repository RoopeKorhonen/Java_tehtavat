package FactoryMethod;

public class OpettajaToinen extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Vesi();
    }
}
