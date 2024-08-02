package org.example;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer anioNac;
    private String id;

    public void generarId() {
        this.id = this.id = String.valueOf(anioNac).substring(2) + nombre.charAt(0) + apellido.charAt(0);
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Año de nacimiento: " + anioNac);
        System.out.println("ID: " + id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(Integer anioNac) {
        this.anioNac = anioNac;
    }

    public String getId() {
        return id;
    }
}
