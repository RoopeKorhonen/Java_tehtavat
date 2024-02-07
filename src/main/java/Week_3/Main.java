package Week_3;
import Week_3.Client.Jasper;
import Week_3.Factories.VaateFactory;
import Week_3.Factories.AdidasFactory;

public class Main {
    public static void main(String[] args) {
        // Voit vaihtaa factoryä täällä AdidasFactorystä BossFactoryyn
        VaateFactory vaateFactory = AdidasFactory.getInstance();
        Jasper jasper = new Jasper(vaateFactory);
        jasper.puePaalle();
    }
}