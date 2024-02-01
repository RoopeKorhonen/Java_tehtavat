package Week_2.Factories;
import Week_2.Models.Vaate;
public interface VaateFactory {
    Vaate luoFarmarit();
    Vaate luoTPaita();
    Vaate luoLippis();
    Vaate luoKengat();
}