package ar.com.onready.api;

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
        Optional<Vehiculo> optional = this.vehiculos.stream().max(Comparator.comparing(Vehiculo::getPrecio));
        if (optional.isPresent()) {
            Vehiculo v = optional.get();
            System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo());
        }
    }

    public void mostrarVehiculoMasBarato() {
        Optional<Vehiculo> optional = this.vehiculos.stream().min(Comparator.comparing(Vehiculo::getPrecio));
        if (optional.isPresent()) {
            Vehiculo v = optional.get();
            System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo());
        }
    }

    public void mostrarVehiculoQueContieneLetra(String letra) {
        List<Vehiculo> result = this.vehiculos.stream()
                .filter(vehiculo -> vehiculo.getModelo().toUpperCase().contains(letra.toUpperCase()))
                .collect(Collectors.toList());

        if (!result.isEmpty()) {
            Vehiculo v = result.get(0);
            System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + v.getMarca() + " " + v.getModelo() + " " + v.getPrecioConFormato());
        } else {
            System.out.println("No hay vehículos que contengan la letra " + letra + " en el modelo.");
        }

    }

    public void mostrarVehiculosOrdenadosPorPrecioDesc() {
        List<Vehiculo> result = this.vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .collect(Collectors.toList());

        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        result.forEach(vehiculo -> System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo()));
    }

}
