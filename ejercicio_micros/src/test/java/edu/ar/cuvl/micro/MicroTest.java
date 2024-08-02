package edu.ar.cuvl.micro;

import edu.ar.cuvl.empleado.Empleado;
import edu.ar.cuvl.empleado.Estado;
import edu.ar.cuvl.exceptions.EmpleadoNoQuiereSubirException;
import edu.ar.cuvl.exceptions.MicroLlenoException;
import edu.ar.cuvl.exceptions.MicroVacioException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MicroTest {
    Micro instance;
    EmpleadoNoQuiereSubirException noQuiereSubirException = new EmpleadoNoQuiereSubirException("1");
    MicroLlenoException microLlenoException = new MicroLlenoException("No hay lugar para subir pasajeros.");
    MicroVacioException microVacioException = new MicroVacioException("No hay pasajeros para bajar.");

    @BeforeEach
    void setUp() {
        instance = new Micro(30, 20, 130, "ABC123");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Verificar que haya lugares disponibles")
    void VerificarQueHayaLugaresDisponibles() {
        int resultado = instance.getLugaresDisponibles();
        assertEquals(50, resultado);
    }

    @Test
    @DisplayName("Verificar que haya asientos disponibles")
    void VerificarQueHayaAsientosDisponibles() {
        int resultado = instance.getAsientosDisponibles();
        assertEquals(20, resultado);
    }

    @Test
    @DisplayName("Verificar que haya parados disponibles")
    void VerificarQueHayaParadosDisponibles() {
        int resultado = instance.getParadosDisponibles();
        assertEquals(30, resultado);
    }

    @Test
    @DisplayName("Verificar que el empleado es el primer pasajero si es el primero en subir")
    void VerificarQueEsPrimerPasajero() {
        Empleado e = mock(Empleado.class);
        instance.setPrimerPasajero(e);
        assertEquals(e, instance.getPrimerPasajero());
    }

    @Test
    @DisplayName("Verificar que no pueden subir empleados si el micro está lleno")
    void VerificarQueNoPuedenSubirEmpleadosSiElMicroEstaLleno() {
        Empleado e = mock(Empleado.class);
        when(e.quiereSubir(instance)).thenReturn(true);
        try {
            instance.subirPasajero(e);
        } catch (MicroLlenoException ex) {
            assertEquals("No hay lugar para subir pasajeros.", ex.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar que no pueden bajar empleados si el micro está vacío")
    void VerificarQueNoPuedenBajarEmpleadosSiElMicroEstaVacio() {
        Empleado e = mock(Empleado.class);
        try {
            instance.bajarPasajero(e);
        } catch (MicroVacioException ex) {
            assertEquals("No hay pasajeros para bajar.", ex.getMessage());
        }
    }

    @Test
    @DisplayName("Verificar que disminuyen los asientos disponibles si se sienta un pasajero")
    void VerificarQueDisminuyenLosAsientosDisponiblesSiSeSientaUnPasajero() {
        Empleado e = mock(Empleado.class);
        when(e.getEstado()).thenReturn(Estado.SENTADO);
        instance.getPasajeros().add(e);
        int resultado = instance.getAsientosDisponibles();
        assertEquals(19, resultado);
    }

    @Test
    @DisplayName("Verificar que disminuyen los asientos disponibles si se suma un pasajero parado")
    void VerificarQueDisminuyenLosAsientosDisponiblesSiSeSumaUnPasajeroParado() {
        Empleado e = mock(Empleado.class);
        when(e.getEstado()).thenReturn(Estado.PARADO);
        instance.getPasajeros().add(e);
        int resultado = instance.getParadosDisponibles();;
        assertEquals(29, resultado);
    }

    @Test
    @DisplayName("Verificar que disminuyen los lugares disponibles si sube un pasajero")
    void VerificarQueDisminuyenLosLugaresDisponiblesSiSubeUnPasajero() {
        Empleado e = mock(Empleado.class);
        when(e.getEstado()).thenReturn(Estado.PARADO);
        instance.getPasajeros().add(e);
        int resultado = instance.getLugaresDisponibles();
        assertEquals(49, resultado);
    }

    @Test
    @DisplayName("Verificar que el pasajero quiere subir")
    void VerificarQueElPasajeroQuiereSubir() {
        Empleado e = mock(Empleado.class);
        when(e.quiereSubir(instance)).thenReturn(true);
        assertTrue(e.quiereSubir(instance));
    }

    @Test
    @DisplayName("Verificar que el pasajero no quiere subir")
    void VerificarQueElPasajeroNoQuiereSubir() {
        Empleado e = mock(Empleado.class);
        when(e.quiereSubir(instance)).thenReturn(false);
        when(e.getLegajo()).thenReturn(1);
        assertEquals("El empleado " + 1 + " no quiere subir al micro.", noQuiereSubirException.getMessage());
    }
}