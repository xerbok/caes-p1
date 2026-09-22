package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestClient {

    @Test
    void testGetId(){
        Client c = new Client("test");
        assertEquals("test", c.getId());
    }
}
