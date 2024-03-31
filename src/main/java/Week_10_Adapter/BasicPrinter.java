package Week_10_Adapter;

class BasicPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}