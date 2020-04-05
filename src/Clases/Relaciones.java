/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author raulpenate
 */
public class Relaciones {
    private Persona oCliente;
    private Persona oVendedor;
    private Sucursal oSucursal;
    private Venta oVenta;

    public Persona getoCliente() {
        return oCliente;
    }

    public void setoCliente(Persona oCliente) {
        this.oCliente = oCliente;
    }

    public Persona getoVendedor() {
        return oVendedor;
    }

    public void setoVendedor(Persona oVendedor) {
        this.oVendedor = oVendedor;
    }

    public Sucursal getoSucursal() {
        return oSucursal;
    }

    public void setoSucursal(Sucursal oSucursal) {
        this.oSucursal = oSucursal;
    }

    public Venta getoVenta() {
        return oVenta;
    }

    public void setoVenta(Venta oVenta) {
        this.oVenta = oVenta;
    }
    
    
    
}
