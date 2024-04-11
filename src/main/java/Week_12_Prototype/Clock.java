package Week_12_Prototype;
// Clock class composed of clock hands
class Clock implements Cloneable {
    private ClockHand hourHand;
    private ClockHand minuteHand;

    public Clock(int hour, int minute) {
        this.hourHand = new ClockHand(hour);
        this.minuteHand = new ClockHand(minute);
    }

    public ClockHand getHourHand() {
        return hourHand;
    }

    public ClockHand getMinuteHand() {
        return minuteHand;
    }

    @Override
    public Clock clone() throws CloneNotSupportedException {
        Clock clonedClock = (Clock) super.clone();
        // Perform deep copy of clock hands
        clonedClock.hourHand = this.hourHand.clone();
        clonedClock.minuteHand = this.minuteHand.clone();
        return clonedClock;
    }
}