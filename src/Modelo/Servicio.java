/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author GAMER
 */
public class Servicio {
    private String clave;
    private String nombre;

    public Servicio(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
