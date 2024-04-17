package Week_13_Facade;
class Memory {
    public void load(long position, char data) {
        System.out.println("Memory: Loading data '" + data + "' to memory address: " + position);
    }
}