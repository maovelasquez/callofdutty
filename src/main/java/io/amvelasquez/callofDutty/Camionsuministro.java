package io.amvelasquez.callofDutty;

public class Camionsuministro extends Vehiculo{

    public int capacidadPasajeros = 120;
    public int capacidadTonelaCarga = 200;

    public Camionsuministro(int capacidadPasajeros, int capacidadTonelaCarga) {
        super(capacidadPasajeros, capacidadTonelaCarga);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadTonelaCarga = capacidadTonelaCarga;
    }

    public Camionsuministro() {

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
