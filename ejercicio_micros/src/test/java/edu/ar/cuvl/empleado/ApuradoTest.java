package edu.ar.cuvl.empleado;

import edu.ar.cuvl.micro.Micro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@DisplayName("Pruebas unitarias de Empleado Apurado")
class ApuradoTest {

    Apurado instance;
    int legajo = 1;

    @BeforeEach
    void setUp() {
        instance = new Apurado(legajo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Verificar que el estado inicial sea a pie")
    void verificarQueElEstadoInicialSeaAPie() {
        assertEquals(Estado.A_PIE, instance.getEstado());
    }

    @Test
    @DisplayName("Verificar que el empleado viaje parado en el micro")
    void verificarQueElEmpleadoViajeParado() {
        Micro micro = mock(Micro.class);
        when(micro.getAsientosDisponibles()).thenReturn(0);
        instance.ocuparLugar(micro);
        assertEquals(Estado.PARADO, instance.getEstado());
    }

    @Test
    @DisplayName("Verificar que el empleado viaje sentado en el micro")
    void verificarQueElEmpleadoViajeSentado() {
        Micro micro = mock(Micro.class);
        when(micro.getAsientosDisponibles()).thenReturn(10);
        instance.ocuparLugar(micro);
        assertEquals(Estado.SENTADO, instance.getEstado());
    }

    @Test
    @DisplayName("Verificar que el empleado quiere subir al micro")
    void VerificarSiQuiereSubir() {
        Micro micro = mock(Micro.class);
        when(micro.getLugaresDisponibles()).thenReturn(0);
        assertTrue(instance.quiereSubir(micro));
    }
}