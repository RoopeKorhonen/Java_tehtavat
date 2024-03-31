package Week_10;
class Chef {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder builder) {
        burgerBuilder = builder;
    }

    public void makeBurger() {
        burgerBuilder.addBun();
        burgerBuilder.addPatty();
        burgerBuilder.addCheese();
        burgerBuilder.addLettuce();
        burgerBuilder.addTomato();
        burgerBuilder.addSauce();
    }

    public Object getBurger() {
        return burgerBuilder.getBurger();
    }
}