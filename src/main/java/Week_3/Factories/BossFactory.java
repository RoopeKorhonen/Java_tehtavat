package Week_3.Factories;
import Week_3.Models.Vaate;
import Week_3.Products.Boss.BossFarmarit;
import Week_3.Products.Boss.BossKengat;
import Week_3.Products.Boss.BossLippis;
import Week_3.Products.Boss.BossTPaita;

public class BossFactory implements VaateFactory {
    private static BossFactory instance;

    private BossFactory() {}

    public static BossFactory getInstance() {
        if (instance == null) {
            instance = new BossFactory();
        }
        return instance;
    }
    @Override
    public Vaate luoFarmarit() {
        return new BossFarmarit();
    }

    @Override
    public Vaate luoTPaita() {
        return new BossTPaita();
    }

    @Override
    public Vaate luoLippis() {
        return new BossLippis();
    }

    @Override
    public Vaate luoKengat() {
        return new BossKengat();
    }
}