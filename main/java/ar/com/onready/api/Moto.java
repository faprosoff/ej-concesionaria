package ar.com.onready.api;

import java.math.BigDecimal;

public class Moto extends Vehiculo {

    // CONTRUCTORES

    public Moto() {
    }

    public Moto(String marca, String modelo, String cilindrada, BigDecimal precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    // VARIABLES

    private String cilindrada;

    // METODOS

    @Override
    public String showUniqueAtribute() {
        return "Cilindrada: " + this.cilindrada + " // ";
    }

}
