package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ObsecuenteTest {
    Obsecuente instance;

    @BeforeEach
    void setUp() {
        instance = new Obsecuente(1, new Moderado(2, 3));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Verificar que quiere subir si su jefe quiere subir")
    void VerificarQueQuiereSubirSiSuJefeQuiereSubir() {
        Micro micro = mock(Micro.class);
        Empleado jefe = mock(Empleado.class);
        when(jefe.quiereSubir(micro)).thenReturn(true);
    }

    @Test
    @DisplayName("Verificar que no quiere subir si su jefe no quiere subir")
    void VerificarQueNoQuiereSubirSiSuJefeNoQuiereSubir() {
        Micro micro = mock(Micro.class);
        Empleado jefe = mock(Empleado.class);
        when(false == jefe.quiereSubir(micro)).thenReturn(false);
    }

}