package Week_13_Facade;
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("ComputerFacade: Starting computer...");
        cpu.freeze();
        char[] bootSector = hardDrive.read(0, 4); // Luetaan käynnistyssektori kiintolevyltä
        for (int i = 0; i < bootSector.length; i++) {
            memory.load(i, bootSector[i]); // Ladataan käynnistyssektori muistiin
        }
        cpu.jump(0); // Hypätään muistiosoitteeseen 0
        cpu.execute(); // Suoritetaan käynnistys
    }
}