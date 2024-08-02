package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ModeradoTest {
    Moderado instance;

    @BeforeEach
    void setUp() {
        instance = new Moderado(1, 10);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Verificar que quiere subir si hay la suficiente cantidad de lugares libres")
    void VerificarQueQuiereSubirSiHayLaSuficienteCantidadDeLugaresLibres() {
        Micro micro = mock(Micro.class);
        when(micro.getLugaresDisponibles()).thenReturn(10);
        assertTrue(instance.quiereSubir(micro));
    }

    @Test
    @DisplayName("Verificar que no quiere subir si no hay la suficiente cantidad de lugares libres")
    void VerificarQueNoQuiereSubirSiNoHayLaSuficienteCantidadDeLugaresLibres() {
        Micro micro = mock(Micro.class);
        when(micro.getLugaresDisponibles()).thenReturn(9);
        assertFalse(instance.quiereSubir(micro));
    }
}