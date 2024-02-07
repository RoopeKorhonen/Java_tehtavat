package Week_3_Observer;

public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        AnalogClock analogClock = new AnalogClock(timer);
        DigitalClock digitalClock = new DigitalClock(timer);

        for (int i = 0; i < 10; i++) {
            timer.tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}