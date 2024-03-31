package Week_10_Adapter;
public class Main {
    public static void main(String[] args) {
        // Normitoteutuksen käyttö
        Printer printer1 = new BasicPrinter();
        printer1.print("Test Document 1");

        // Adapterin käyttö olemassa olevan luokan kanssa
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printer2 = new LegacyPrinterAdapter(legacyPrinter);
        printer2.print("Test Document 2");
    }
}
