package Week_3.Factories;
import Week_3.Models.Vaate;
import Week_3.Products.Adidas.AdidasFarmarit;
import Week_3.Products.Adidas.AdidasTPaita;
import Week_3.Products.Adidas.AdidasLippis;
import Week_3.Products.Adidas.AdidasKengat;


public class AdidasFactory implements VaateFactory {

    private static AdidasFactory instance;

    private AdidasFactory() {}

    public static AdidasFactory getInstance() {
        if (instance == null) {
            instance = new AdidasFactory();
        }
        return instance;
    }
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