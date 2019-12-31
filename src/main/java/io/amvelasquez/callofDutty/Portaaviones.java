package io.amvelasquez.callofDutty;

public class Portaaviones extends Vehiculo {

    public int capacidadPasajeros = 800;
    public int capacidadTonelaCarga = 500;


    public Portaaviones(int capacidadPasajeros, int capacidadTonelaCarga) {
        super(capacidadPasajeros, capacidadTonelaCarga);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadTonelaCarga = capacidadTonelaCarga;
    }


    public Portaaviones() {

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

