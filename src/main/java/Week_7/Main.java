package Week_7;

public class Main {
    public static void main(String[] args) {
        Guesser guesser = new Guesser();
        guesser.joinGame();


        Player player1 = new Player(guesser);
        Player player2 = new Player(guesser);


        player1.play(50);
        player2.play(70);
    }
}