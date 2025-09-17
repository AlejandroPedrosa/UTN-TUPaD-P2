/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

/**
 *
 * @author dev-alejandropedrosa
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; 
    private Mesa mesa;       

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" +
               "fecha=" + fecha +
               ", hora=" + hora +
               ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
               ", mesa=" + (mesa != null ? mesa.getNumero() : "null") +
               '}';
    }
}
