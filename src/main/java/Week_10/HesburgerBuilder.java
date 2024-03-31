package Week_10;
import java.util.ArrayList;
import java.util.List;
class HesburgerBuilder implements BurgerBuilder {
    private List<Object> parts;

    public HesburgerBuilder() {
        this.parts = new ArrayList<>();
    }

    @Override
    public void addBun() {
        parts.add(new HesburgerBun());
    }

    @Override
    public void addPatty() {
        parts.add(new HesburgerPatty());
    }

    @Override
    public void addCheese() {
        parts.add(new HesburgerCheese());
    }

    @Override
    public void addLettuce() {
        parts.add(new HesburgerLettuce());
    }

    @Override
    public void addTomato() {
        parts.add(new HesburgerTomato());
    }

    @Override
    public void addSauce() {
        parts.add(new HesburgerSauce());
    }

    @Override
    public List<Object> getBurger() {
        return parts;
    }
}
