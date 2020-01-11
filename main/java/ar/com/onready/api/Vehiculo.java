package ar.com.onready.api;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class Vehiculo implements iVehiculo {

    // CONSTRUCTORES

    Vehiculo() {
    }

    Vehiculo(String marca, String modelo, BigDecimal precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // VARIABLES

    private String marca;
    private String modelo;
    private BigDecimal precio;
    private DecimalFormat df = new DecimalFormat("$###,###.00");

    // GETTERS

    String getMarca() { return marca; }

    String getModelo() {
        return modelo;
    }

    BigDecimal getPrecio() {
        return precio;
    }

    String getPrecioConFormato() { return df.format(this.precio); }

    // METODOS

    public void mostrarVehiculo() {
        System.out.println(showMarca() + showModelo() + showUniqueAtribute() + showPrecio());
    }

    public String showMarca() {
        return "Marca: " + this.marca + " // ";
    }

    public String showModelo() {
        return "Modelo: " + this.modelo + " // ";
    }

    public String showPrecio() {
        return "Precio: " + getPrecioConFormato();
    }

}
