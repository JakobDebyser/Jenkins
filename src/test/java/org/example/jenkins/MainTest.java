package org.example.jenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void hello() {
        Main main = new Main();
        String hello = main.hello();
        assertEquals("Hello", hello);
    }

}