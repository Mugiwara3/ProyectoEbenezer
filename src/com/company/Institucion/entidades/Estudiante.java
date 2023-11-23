package com.company.Institucion.entidades;

public class Estudiante {

    private String id;
    private String nombre;
    private String apellido;
    private String edad;
    private String curso;

    public Estudiante(String id, String nombre, String apellido, String edad, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }

    // Getter para el ID
    public String getId() {
        return id;
    }

    // Setter para el ID
    public void setId(String id) {
        this.id = id;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el apellido
    public String getApellido() {
        return apellido;
    }

    // Setter para el apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getter para la edad
    public String getEdad() {
        return edad;
    }

    // Setter para la edad
    public void setEdad(String edad) {
        this.edad = edad;
    }

    // Getter para el curso
    public String getCurso() {
        return curso;
    }

    // Setter para el curso
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
