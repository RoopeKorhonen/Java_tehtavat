package Week_8.Visitor;
class BonusState implements State {
    @Override
    public void handleBonus(BonusVisitor bonusVisitor) {
        bonusVisitor.visit(this);
    }
}