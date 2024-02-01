package Week_2;
import Week_2.Client.Jasper;
import Week_2.Factories.VaateFactory;
import Week_2.Factories.AdidasFactory;
import Week_2.Factories.BossFactory;

    public class Main {
    public static void main(String[] args) {
        // Voit vaihtaa factoryä täällä AdidasFactorystä BossFactoryyn
        VaateFactory vaateFactory = new AdidasFactory();
        Jasper jasper = new Jasper(vaateFactory);
        jasper.puePaalle();
    }
}