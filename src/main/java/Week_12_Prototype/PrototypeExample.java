package Week_12_Prototype;
public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create original clock
        Clock originalClock = new Clock(12, 30);

        // Clone the clock
        Clock clonedClock = originalClock.clone();

        // Print state of original and cloned clocks
        System.out.println("Original Clock:");
        printTime(originalClock);
        System.out.println("Cloned Clock:");
        printTime(clonedClock);

        // Change time of original clock
        originalClock.getHourHand().setTime(10);

        // Print updated state
        System.out.println("Original Clock (after change):");
        printTime(originalClock);
        System.out.println("Cloned Clock (after change):");
        printTime(clonedClock);
    }

    private static void printTime(Clock clock) {
        System.out.println("Hours: " + clock.getHourHand().getTime() +
                ", Minutes: " + clock.getMinuteHand().getTime());
    }
}