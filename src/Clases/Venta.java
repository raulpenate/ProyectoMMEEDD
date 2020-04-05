/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author raulpenate
 */
public class Venta {
    private Persona cliente;
    private Persona vendedor;
    private String carro;
    private double precio;
    private String fechaVenta;

    public Venta(Persona cliente, Persona vendedor, String carro, double precio, String fechaVenta) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carro = carro;
        this.precio = precio;
        this.fechaVenta = fechaVenta;
    }

    
    
    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public void setVendedor(Persona vendedor) {
        this.vendedor = vendedor;
    }
    
    


}
