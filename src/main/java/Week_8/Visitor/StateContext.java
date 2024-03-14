package Week_8.Visitor;
// Context class
class StateContext {
    private State state;

    public StateContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void accept(BonusVisitor bonusVisitor) {
        state.handleBonus(bonusVisitor);
    }
}