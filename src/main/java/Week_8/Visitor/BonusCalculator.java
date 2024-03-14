package Week_8.Visitor;
// Concrete Visitor class
class BonusCalculator implements BonusVisitor {
    @Override
    public void visit(NormalState context) {
        System.out.println("Normal state bonus points: +10");
    }

    @Override
    public void visit(BonusState context) {
        System.out.println("Bonus state bonus points: +20");
    }
}
