package edu.ar.cuvl.exceptions;

public class MicroVacioException extends RuntimeException {
    private String message;

    public MicroVacioException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "El micro está vacío. " + message;
    }
}
