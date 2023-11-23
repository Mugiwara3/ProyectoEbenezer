package com.mycompany.Institucion.entidades;

public class Login {

    private String usuario;
    private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean validarCredenciales() {
        return usuario.equals("usuario2023") && contrasena.equals("ebe2023");
    }
}
