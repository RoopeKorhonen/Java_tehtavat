package Week_2.Factories;
import Week_2.Models.Vaate;
import Week_2.Products.Adidas.AdidasFarmarit;
import Week_2.Products.Adidas.AdidasTPaita;
import Week_2.Products.Adidas.AdidasLippis;
import Week_2.Products.Adidas.AdidasKengat;


public class AdidasFactory implements VaateFactory {
    @Override
    public Vaate luoFarmarit() {
        return new AdidasFarmarit();
    }

    @Override
    public Vaate luoTPaita() {
        return new AdidasTPaita();
    }

    @Override
    public Vaate luoLippis() {
        return new AdidasLippis();
    }

    @Override
    public Vaate luoKengat() {
        return new AdidasKengat();
    }
}