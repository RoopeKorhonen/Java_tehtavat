package Week_13_Facade;
class HardDrive {
    public char[] read(long lba, int size) {
        System.out.println("HardDrive: Reading data from LBA " + lba + " with size " + size);
        return new char[]{'A', 'B', 'C', 'D'}; // Simuloitu luetut datat
    }
}