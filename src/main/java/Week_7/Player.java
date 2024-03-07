package Week_7;

class Player {
    private final Guesser guesser;

    public Player(Guesser guesser) {
        this.guesser = guesser;
    }

    public void play(int guess) {
        if (guesser.guess(guess)) {
            System.out.println("Pelaaja: Voitin pelin!");
        } else {
            System.out.println("Pelaaja: Yritän uudelleen.");
        }
    }
}