package edu.ar.cuvl.exceptions;

import edu.ar.cuvl.empleado.Apurado;
import edu.ar.cuvl.empleado.Empleado;
import edu.ar.cuvl.micro.Micro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicroVacioExceptionTest {
    Micro instance;

    @BeforeEach
    void setUp() {
        instance = new Micro(10, 10, 10);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMessage() {
    }

    @Test
    void bajarPasajero() {
        Empleado em = new Apurado(1);
        try {
            instance.bajarPasajero(em);
            fail("Debería haber lanzado una excepción");
        } catch (MicroVacioException e) {
            assertEquals("El micro está vacío. No hay pasajeros para bajar.", e.getMessage());
        }
    }
}