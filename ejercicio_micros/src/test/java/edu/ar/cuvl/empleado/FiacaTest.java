package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FiacaTest {
    Fiaca instance;

    @BeforeEach
    void setUp() {
        instance = new Fiaca(1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Verificar que quiere subir si hay lugar")
    void VerificarQueQuiereSubirSiHayLugar() {
        Micro micro = mock(Micro.class);
        when(micro.getAsientosDisponibles()).thenReturn(10);
        assertTrue(instance.quiereSubir(micro));
    }

    @Test
    @DisplayName("Verificar que no quiere subir si no hay lugar")
    void VerificarQueNoQuiereSubirSiNoHayLugar() {
        Micro micro = mock(Micro.class);
        when(micro.getAsientosDisponibles()).thenReturn(0);
        assertFalse(instance.quiereSubir(micro));
    }
}