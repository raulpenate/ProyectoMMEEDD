/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author raulpenate
 */
public class Sucursal {

    private String lugar;
    private String nombre;
    private Persona oGerente;
    private ArrayList<Persona> lCaj;
    private ArrayList<Venta> lVenta;

    public Sucursal(String lugar, String nombre, Persona oGerente, ArrayList<Persona> lCaj,ArrayList<Venta> lVenta) {
        this.lugar = lugar;
        this.nombre = nombre;
        this.oGerente = oGerente;
        this.lCaj = lCaj;
        this.lVenta = lVenta;
    }
    

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public Persona getGerente() {
        return oGerente;
    }

    public void setGerente(Persona oGerente) {
        this.oGerente = oGerente;
    }

    public ArrayList<Persona> getlCaj() {
        return lCaj;
    }

    public void setlCaj(ArrayList<Persona> lCaj) {
        this.lCaj = lCaj;
    }

    public Persona getoGerente() {
        return oGerente;
    }

    public void setoGerente(Persona oGerente) {
        this.oGerente = oGerente;
    }

    public ArrayList<Venta> getlVenta() {
        return lVenta;
    }

    public void setoVentas(ArrayList<Venta> lVenta) {
        this.lVenta = lVenta;
    }

    
}
