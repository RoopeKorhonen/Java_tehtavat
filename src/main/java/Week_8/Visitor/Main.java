package Week_8.Visitor;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create context object with initial state
        StateContext context = new StateContext(new NormalState());

        // Create visitor object
        BonusVisitor bonusVisitor = new BonusCalculator();

        // Accept visitor, which will delegate the request to the state object
        context.accept(bonusVisitor);

        // Change state and accept visitor again
        context.setState(new BonusState());
        context.accept(bonusVisitor);
    }
}