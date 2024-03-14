package Week_8.Visitor;

// Concrete State classes
class NormalState implements State {
    @Override
    public void handleBonus(BonusVisitor bonusVisitor) {
        bonusVisitor.visit(this);
    }
}