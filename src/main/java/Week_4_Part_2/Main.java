package Week_4_Part_2;
import Week_4_Part_2.Characters.States.PokemonState;
import Week_4_Part_2.Characters.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 6; i++) {
            System.out.println("Pokemon tekee temppuja...");
            pokemon.performAction();
            System.out.println();
        }
    }
}