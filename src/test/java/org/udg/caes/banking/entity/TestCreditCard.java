package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCreditCard {

    @Test
    void testCredit(){
        CreditCard cc = new CreditCard("test");     // Arrange
        cc.credit(100);                         // Act
        assertEquals(100 ,cc.getCredit());     // Assert
    }
}

/* git config --global --unset user.name
git config --global --unset user.email
git config --global --list */