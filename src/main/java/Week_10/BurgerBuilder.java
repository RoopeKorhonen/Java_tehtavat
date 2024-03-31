package Week_10;

interface BurgerBuilder {
    void addBun();
    void addPatty();
    void addCheese();
    void addLettuce();
    void addTomato();
    void addSauce();
    Object getBurger();
}