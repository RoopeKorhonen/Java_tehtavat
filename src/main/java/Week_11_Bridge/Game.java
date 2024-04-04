package Week_11_Bridge;
public class Game {
    public static void main(String[] args) {
        Platform platform;
        if (isWindows()) {
            platform = new WindowsPlatform();
        } else if (isMacOS()) {
            platform = new MacOSPlatform();
        } else {
            throw new RuntimeException("Unsupported platform");
        }

        Character character = new PlayerCharacter(platform);
        character.move();
    }


    private static boolean isWindows() {

        return true;
    }

    private static boolean isMacOS() {

        return false;
    }
}