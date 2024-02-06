// AccountTest.java
import Week_3_OhtuUnitTesting_2.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawSufficientFunds() {
        Account account = new Account();
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(50.0);
        assertEquals(50.0, withdrawnAmount, 0.0);
        assertEquals(50.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        Account account = new Account();
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(150.0);
        assertEquals(0.0, withdrawnAmount, 0.0);
        assertEquals(100.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawNegativeAmount() {
        Account account = new Account();
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(-50.0);
        assertEquals(0.0, withdrawnAmount, 0.0);
        assertEquals(100.0, account.getBalance(), 0.0);
    }
}
