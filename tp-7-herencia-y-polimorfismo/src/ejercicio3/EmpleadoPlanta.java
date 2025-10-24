/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author dev-alejandropedrosa
 */
public class EmpleadoPlanta extends Empleo {

    private double sueldo;
    private int antiguedad;

    public EmpleadoPlanta(double sueldo, int antiguedad, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldo * antiguedad;
    }
}