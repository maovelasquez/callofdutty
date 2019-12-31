package io.amvelasquez.callofDutty;

public class Crucero extends Vehiculo {

    public int capacidadPasajeros = 300;
    public int capacidadTonelaCarga = 310;


    public Crucero(int capacidadPasajeros, int capacidadTonelaCarga, String tipoArmamento, int capacidadMunicion, int capacidadPasajeros1, int capacidadTonelaCarga1) {
        super(capacidadPasajeros, capacidadTonelaCarga, tipoArmamento, capacidadMunicion);
        this.capacidadPasajeros = capacidadPasajeros1;
        this.capacidadTonelaCarga = capacidadTonelaCarga1;
    }

    public Crucero() {

    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public int getCapacidadTonelaCarga() {
        return capacidadTonelaCarga;
    }

    public void setCapacidadTonelaCarga(int capacidadTonelaCarga) {
        this.capacidadTonelaCarga = capacidadTonelaCarga;
    }
}
