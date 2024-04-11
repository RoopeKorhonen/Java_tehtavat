package Week_12_Prototype;
class ClockHand implements Cloneable {
    private int time;

    public ClockHand(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public ClockHand clone() throws CloneNotSupportedException {
        return (ClockHand) super.clone();
    }
}
