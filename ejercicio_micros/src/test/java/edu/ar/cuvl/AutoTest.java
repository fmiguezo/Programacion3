package edu.ar.cuvl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    private Auto instance;

    @BeforeEach
    void setUp() {
        instance = new Auto(100);
    }

    @Test
    void avanzar() {
        int resultado = instance.avanzar(10);
        assertEquals(90, resultado);
    }
}