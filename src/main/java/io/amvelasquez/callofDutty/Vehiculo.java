package io.amvelasquez.callofDutty;

public class Vehiculo {

    public int capacidadPasajeros;
    public int capacidadTonelaCarga;
    public String tipoArmamento;
    public int capacidadMunicion;


    public Vehiculo(int capacidadPasajeros, int capacidadTonelaCarga,
                    String tipoArmamento, int capacidadMunicion) {

    }

    public Vehiculo() {

    }

    public Vehiculo(int capacidadPasajeros, int capacidadTonelaCarga) {

    }


    public int getCapacidadTonelaCarga() {
        return capacidadTonelaCarga;
    }

    public String getTipoArmamento() {
        return tipoArmamento;
    }


    public int getCapacidadMunicion() {
        return capacidadMunicion;
    }


}