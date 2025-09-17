/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author dev-alejandropedrosa
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;      
    private Cliente cliente;  

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
               "numero=" + numero +
               ", fechaVencimiento=" + fechaVencimiento +
               ", banco=" + (banco != null ? banco.getNombre() : "null") +
               ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
               '}';
    }
}
