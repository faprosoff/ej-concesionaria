package ar.com.onready;

import ar.com.onready.api.Auto;
import ar.com.onready.api.Concesionaria;
import ar.com.onready.api.Moto;
import ar.com.onready.api.Vehiculo;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = Arrays.asList(
                new Auto("Peugeot", "206", 4, BigDecimal.valueOf(200000)),
                new Moto("Honda", "Titan", "125c", BigDecimal.valueOf(60000)),
                new Auto("Peugeot", "208", 5, BigDecimal.valueOf(250000)),
                new Moto("Yamaha", "YBR", "160c", BigDecimal.valueOf(80500.5))
        );

        Concesionaria miConcesionaria = new Concesionaria(vehiculos);

        miConcesionaria.mostrarVehiculos();

        System.out.println("=============================");
        miConcesionaria.mostrarVehiculoMasCaro();
        miConcesionaria.mostrarVehiculoMasBarato();

        System.out.println("=============================");
        miConcesionaria.mostrarVehiculoQueContieneLetra("Y");

        System.out.println("=============================");
        miConcesionaria.mostrarVehiculosOrdenadosPorPrecioDesc();

    }
}

