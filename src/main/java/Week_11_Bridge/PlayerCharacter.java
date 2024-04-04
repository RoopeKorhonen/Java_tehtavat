package Week_11_Bridge;
class PlayerCharacter extends Character {
    public PlayerCharacter(Platform platform) {
        super(platform);
    }

    public void move() {
        platform.moveCharacter();
    }
}