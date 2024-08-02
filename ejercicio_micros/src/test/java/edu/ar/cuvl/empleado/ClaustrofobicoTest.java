package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClaustrofobicoTest {

    Claustrofobico instance;

    @BeforeEach
    void setUp() {
        instance = new Claustrofobico(1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Verificar que quiere subir si el volumen es grande")
    void VerificarQueQuiereSubirSiElVolumenEsGrande() {
        Micro micro = mock(Micro.class);
        when(micro.getVolumen()).thenReturn(130.0);
        assertTrue(instance.quiereSubir(micro));
    }

    @Test
    @DisplayName("Verificar que quiere subir si el volumen es grande")
    void VerificarQueNoQuiereSubirSiElVolumenEsChico() {
        Micro micro = mock(Micro.class);
        when(micro.getVolumen()).thenReturn(100.0);
        assertFalse(instance.quiereSubir(micro));
    }
}