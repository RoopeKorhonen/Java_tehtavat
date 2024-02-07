package Week_3.Client;
import Week_3.Factories.VaateFactory;
import Week_3.Models.Vaate;


public class Jasper {
    private VaateFactory vaateFactory;

    public Jasper(VaateFactory vaateFactory) {
        this.vaateFactory = vaateFactory;
    }

    public void puePaalle() {
        Vaate farmarit = vaateFactory.luoFarmarit();
        Vaate tPaita = vaateFactory.luoTPaita();
        Vaate lippis = vaateFactory.luoLippis();
        Vaate kengat = vaateFactory.luoKengat();

        System.out.println("Jasper pukee päälleen:");
        System.out.println(farmarit);
        System.out.println(tPaita);
        System.out.println(lippis);
        System.out.println(kengat);
    }
}