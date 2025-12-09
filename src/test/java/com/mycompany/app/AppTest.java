package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        String result = App.message();
        assertEquals("Hello from App!", result);
    }
}
