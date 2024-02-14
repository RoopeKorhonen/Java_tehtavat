package Week_4_Part_2.Characters;
import Week_4_Part_2.Characters.States.PokemonState;
import Week_4_Part_2.Characters.States.PichuState;
import Week_4_Part_2.Characters.States.PikachuState;
import Week_4_Part_2.Characters.States.RaichuState;

public class Pokemon {
    private PokemonState currentState;

    public Pokemon() {
        // Alustetaan Pokemon Pichu-tilaan
        this.currentState = new PichuState();
    }

    // Metodi toiminnon suorittamiseen, joka riippuu nykyisestä tilasta
    public void performAction() {
        this.currentState.performAction();
        // Simuloidaan tilanvaihto
        evolve();
    }

    // Simuloitu tilanvaihto, joka riippuu nykyisestä tilasta
    private void evolve() {
        if (this.currentState instanceof PichuState) {
            System.out.println("Pichu kehittyy Pikachuksi!");
            this.currentState = new PikachuState();
        } else if (this.currentState instanceof PikachuState) {
            System.out.println("Pikachu kehittyy Raichuksi!");
            this.currentState = new RaichuState();
        } else if (this.currentState instanceof RaichuState) {
            System.out.println("Raichu pysyy Raichuna!");
            // Raichu ei kehity enää eteenpäin
        }
    }
}