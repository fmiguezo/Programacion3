package edu.ar.cuvl.exceptions;

public class EmpleadoNoQuiereSubirException extends RuntimeException {
    private String message;

    public EmpleadoNoQuiereSubirException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "El empleado " + message + " no quiere subir al micro." ;
    }
}
