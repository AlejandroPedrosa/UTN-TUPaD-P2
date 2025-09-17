/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Titular{" +
               "nombre=" + nombre +
               ", dni=" + dni +
               ", cuenta=" + (cuenta != null ? cuenta.getCbu() : "null") +
               '}';
    }
}

