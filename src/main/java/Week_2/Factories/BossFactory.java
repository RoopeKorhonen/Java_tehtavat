package Week_2.Factories;
import Week_2.Models.Vaate;
import Week_2.Products.Boss.BossFarmarit;
import Week_2.Products.Boss.BossKengat;
import Week_2.Products.Boss.BossLippis;
import Week_2.Products.Boss.BossTPaita;

public class BossFactory implements VaateFactory {
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