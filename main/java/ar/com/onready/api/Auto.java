package ar.com.onready.api;

import java.math.BigDecimal;

public class Auto extends Vehiculo {

    // CONSTRUCTORES

    public Auto() {
    }

    public Auto(String marca, String modelo, int puertas, BigDecimal precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    // VARIABLES

    private int puertas;

    // METODOS

    @Override
    public String showUniqueAtribute() {
        return "Puertas: " + this.puertas + " // ";
    }

}
