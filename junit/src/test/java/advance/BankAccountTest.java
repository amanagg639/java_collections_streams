package junit.src.test.java.advance;

import static org.junit.jupiter.api.Assertions.*;

import advance.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100);
    }

    @Test
    void testDeposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Balance should increase after deposit");
    }

    @Test
    void testWithdraw() {
        account.withdraw(30);
        assertEquals(70, account.getBalance(), "Balance should decrease after withdrawal");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200),
                "Should throw exception for insufficient funds");
    }

    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10),
                "Should throw exception for negative deposits");
    }

    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-5),
                "Should throw exception for negative withdrawals");
    }
}