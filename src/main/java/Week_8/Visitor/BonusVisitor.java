package Week_8.Visitor;

public interface BonusVisitor {
    void visit(NormalState normalState);
    void visit(BonusState bonusState);
    // other visit methods for other states...
}