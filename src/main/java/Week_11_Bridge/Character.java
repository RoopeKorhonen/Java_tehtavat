package Week_11_Bridge;
abstract class Character {
    protected Platform platform;

    public Character(Platform platform) {
        this.platform = platform;
    }

    public abstract void move();
}