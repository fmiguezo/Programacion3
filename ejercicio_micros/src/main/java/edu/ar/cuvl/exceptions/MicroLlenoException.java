package edu.ar.cuvl.exceptions;

public class MicroLlenoException extends RuntimeException {
    private String message;

    public MicroLlenoException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "El micro está lleno: " + message;
    }
}
