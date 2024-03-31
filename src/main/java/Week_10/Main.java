package Week_10;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        // Making a Hesburger
        chef.setBurgerBuilder(new HesburgerBuilder());
        chef.makeBurger();
        List<Object> hesburger = (List<Object>) chef.getBurger();
        System.out.println("Hesburger parts: " + hesburger);

        // Making a McDonald's Burger
        chef.setBurgerBuilder(new McDonaldsBuilder());
        chef.makeBurger();
        StringBuilder mcDonaldsBurger = (StringBuilder) chef.getBurger();
        System.out.println("McDonald's Burger: " + mcDonaldsBurger);
    }
}