package Week_4_Part_2.Characters.States;
public class PichuState implements PokemonState {
    @Override
    public void performAction() {
        System.out.println("Pichu hyökkää sähköiskulla!");
    }
}