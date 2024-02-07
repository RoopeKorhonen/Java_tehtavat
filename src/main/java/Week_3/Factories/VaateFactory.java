package Week_3.Factories;
import Week_3.Models.Vaate;
public interface VaateFactory {
    Vaate luoFarmarit();
    Vaate luoTPaita();
    Vaate luoLippis();
    Vaate luoKengat();
}