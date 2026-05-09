
package com.practica.productos.modelo;

public class Producto {
private String nombre;
public Producto(String nombre) {
if (nombre == null || nombre.trim().isEmpty()) {
throw new IllegalArgumentException("Nombre inválido");
}

        }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
