package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;
import org.udg.caes.banking.exceptions.NotEnoughBalance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAccount {

    @Test
    void testGetId(){
        Account a = new Account("test", 0);
        assertEquals("test", a.getId());
    }

    @Test
    void testCredit(){
        Account a = new Account("test", 0);
        a.credit(100);
        assertEquals(100, a.getBalance());
    }

    @Test
    void testDebit() throws NotEnoughBalance {
        Account a = new Account("test", 0);
        a.credit(200);
        a.debit(100);
        assertEquals(100, a.getBalance());
    }

    @Test
    void testDebitNotEnoughBalance() {
        Account a = new Account("test", 0);
        a.credit(200);

        assertThrows(NotEnoughBalance.class, () -> {
            a.debit(300);
        });
        assertEquals(200, a.getBalance());
    }
}
