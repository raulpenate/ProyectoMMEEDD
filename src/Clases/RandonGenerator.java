/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author raulpenate
 */
public class RandonGenerator {

    public String generarNombreSucursal() {
        //Se crean los valores a salir
        String[] nombreParteUno = {
            "Used",
            "Venta de Autos",
            "Sucursal",
            "Usados",
            "Racing",
            "Autolote",
            "Eurocars",
            "CarExpress",
            "Distro Racing",
            "Car-Workshop",
            "Autopartes",
            "Lote",
            "Sucursal",
            "CarroGangas"};
        String[] nombreParteDos = {
            "Lemuz",
            "Ortíz",
            "Veléz",
            "Del Valley",
            "Del Solar",
            "Lopéz",
            "Regalado",
            "Romero",
            "Asegonye",
            "Salah",
            "McGregor",
            "Bisping",
            "Rogan",
            "Obama",
            "Dos Anjos",
            "Silva",
            "Peterson"};
        //Se crean los valores random
        Random rndTwo = new Random();
        Random rndOne = new Random();
        return nombreParteUno[rndOne.nextInt(nombreParteUno.length)] + " " + nombreParteDos[rndTwo.nextInt(nombreParteDos.length)];
    }

    public String generadorLugar() {
        String[] aLugares = {
            "San Salvador",
            "Santa Ana",
            "Santa Tecla",
            "Soyapango",
            "Mejicanos",
            "Apopa",
            "Ilopango",
            "Sonsonate",
            "Delgado",
            "Zacatecoluca",
            "San Martín",
            "Cojutepque",
            "Ahuachapan",
            "San Vicente",
            "La Unión",
            "Metapan",
            "Usulutan",
            "San Marcos",
            "Izalco",
            "Acajutla",
            "Chalchuapa",
            "Nejapa"
        };
        Random rnd = new Random();
        return aLugares[rnd.nextInt(aLugares.length)];
    }

    public String generadorNombrePersona() {
        String[] Nombre = {
            "Ana",
            "Mirna",
            "María",
            "Joseph",
            "Anthony",
            "Roberto",
            "Mike",
            "Bety",
            "Josh",
            "Steven",
            "Mario",
            "Rose",
            "Sun",
            "Rodolfa",
            "Estela",
            "Ramona",
            "Marta",
            "Guadalupe"};
        //Generador Random
        Random rnd = new Random();
        return Nombre[rnd.nextInt(Nombre.length)];
    }

    public String generadorApellidoPersona() {
        String[] Apellido = {
            "Ramírez",
            "Lemuz",
            "Ortíz",
            "Quintana",
            "Funes",
            "Jordan",
            "Ikerson",
            "Nurgagomedov",
            "Romero",
            "Asegonye",
            "Salah",
            "McGregor",
            "Bisping",
            "Rogan",
            "Obama",
            "Dos Anjos",
            "Silva",
            "Peterson"};
        //Generador Random
        Random rnd = new Random();
        return Apellido[rnd.nextInt(Apellido.length)];
    }

    public String generarDui() {
        //Parte antes del Guion
        Random rnd = new Random();
        int parteUno = 0;
        do {
            parteUno = rnd.nextInt(79999998);
        } while (parteUno < 70000001);
        //Parte despues del Guion
        Random rndDos = new Random();
        int parteDos = rndDos.nextInt(9);
        return parteUno + "-" + parteDos;
    }

    public String generarCarro() {
        //LISTA DE MODELOS
        String[] modelos = {
            "AUDI",
            "BENTLEY",
            "BMW",
            "CHREVOLET",
            "CITROEN",
            "DACIA",
            "FORD",
            "FIAT",
            "HYUNDAI",
            "HONDA",
            "INFINITI",
            "KIA",
            "LAND ROVER",
            "LEXUS",
            "NISSAN",
            "PEUGEOT",
            "PORSHE",
            "SUBARU",
            "SUZUKI",
            "TOYOTA"};
        //GENERARLOS RANDOM
        Random rndBrand = new Random();
        //AÑO RANDOM
        Random rndYear = new Random();
        GregorianCalendar grego = new GregorianCalendar();
        grego.set(grego.YEAR, 2010 + rndYear.nextInt(11));
        return modelos[rndBrand.nextInt(modelos.length)] + " del " + grego.get(grego.YEAR);
    }

    public double generarPrecio() {
        DecimalFormat df = new DecimalFormat("#.##");
        Random rndDouble = new Random();
        return  Double.parseDouble(String.format("%.2f", rndDouble.nextDouble()*100000));
    }
    
    public String generarFecha(){
    GregorianCalendar gc = new GregorianCalendar();
        Random rnd = new Random();
        //Partiendo desde al año y se añade el extra random que se quiere
        int año = 2018 + rnd.nextInt(3);
        gc.set(gc.YEAR, año);
        int mes = rnd.nextInt(12);
        gc.set(gc.MONTH, mes);
        int dia = rnd.nextInt(gc.getActualMaximum(gc.DAY_OF_MONTH));
        gc.set(gc.DATE, dia);
        //Se genera fecha
        return gc.get(gc.DATE) + "/" + (gc.get(gc.MONTH)+1) + "/"+gc.get(gc.YEAR);
    }
    
}   
