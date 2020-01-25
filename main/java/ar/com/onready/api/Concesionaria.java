package ar.com.onready.api;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Concesionaria implements iConcesionaria {

    // CONSTRUCTORES

    public Concesionaria() {
    }

    public Concesionaria(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    // VARIABLES

    private List<Vehiculo> vehiculos;

    // METODOS

    public void mostrarVehiculos() {
        this.vehiculos.forEach(Vehiculo::mostrarVehiculo);
    }

    public void mostrarVehiculoMasCaro() {
        this.vehiculos
                .stream()
                .max(Comparator.comparing(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo()));
    }

    public void mostrarVehiculoMasBarato() {
        this.vehiculos
                .stream()
                .min(Comparator.comparing(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo()));
    }

    public void mostrarVehiculoQueContieneLetra(String letra) {
        System.out.println("Vehículos que contienen en el modelo la letra '" + letra + "':");
        this.vehiculos
                .stream()
                .filter(v -> v.getModelo().toUpperCase().contains(letra.toUpperCase()))
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getPrecioConFormato()));
    }

    public void mostrarVehiculosOrdenadosPorPrecioDesc() {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        this.vehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

}
