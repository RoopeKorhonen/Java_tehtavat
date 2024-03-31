package Week_10;
import java.util.ArrayList;
import java.util.List;
class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder burger;

    public McDonaldsBuilder() {
        this.burger = new StringBuilder();
    }

    @Override
    public void addBun() {
        burger.append("McDonald's Bun, ");
    }

    @Override
    public void addPatty() {
        burger.append("McDonald's Patty, ");
    }

    @Override
    public void addCheese() {
        burger.append("McDonald's Cheese, ");
    }

    @Override
    public void addLettuce() {
        burger.append("McDonald's Lettuce, ");
    }

    @Override
    public void addTomato() {
        burger.append("McDonald's Tomato, ");
    }

    @Override
    public void addSauce() {
        burger.append("McDonald's Sauce, ");
    }

    @Override
    public StringBuilder getBurger() {
        return burger;
    }
}