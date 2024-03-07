package Week_7;
import java.util.Random;

class Guesser {
    private int secretNumber;

    public Guesser() {

        generateSecretNumber();
    }

    private void generateSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(100);
    }

    public void joinGame() {
        System.out.println("Arvuuttaja: Uusi pelaaja liittyi peliin.");
    }

    public GuesserMemento save() {
        return new GuesserMemento(secretNumber);
    }

    public void restore(GuesserMemento memento) {
        secretNumber = memento.getSecretNumber();
    }

    public boolean guess(int number) {
        if (number == secretNumber) {
            System.out.println("Arvuuttaja: Oikein arvattu! Arvattu luku oli: " + secretNumber);
            return true;
        } else {
            System.out.println("Arvuuttaja: Väärin arvattu. Yritä uudelleen!");
            return false;
        }
    }
}