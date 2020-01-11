package ar.com.onready;

import ar.com.onready.api.Auto;
import ar.com.onready.api.Concesionaria;
import ar.com.onready.api.Moto;
import ar.com.onready.api.Vehiculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        vehiculos.add(new Auto("Peugeot", "206", 4, BigDecimal.valueOf(200000)));
        vehiculos.add(new Moto("Honda", "Titan", "125c", BigDecimal.valueOf(60000)));
        vehiculos.add(new Auto("Peugeot", "208", 5, BigDecimal.valueOf(250000)));
        vehiculos.add(new Moto("Yamaha", "YBR", "160c", BigDecimal.valueOf(80500.5)));

        Concesionaria miConcesionaria = new Concesionaria(vehiculos);

        miConcesionaria.mostrarVehiculos();

        System.out.println("=============================");

        miConcesionaria.mostrarVehiculoMasCaro();
        miConcesionaria.mostrarVehiculoMasBarato();
        miConcesionaria.mostrarVehiculoQueContieneLetra("Y");

        System.out.println("=============================");
        miConcesionaria.mostrarVehiculosOrdenadosPorPrecioDesc();

    }
}

