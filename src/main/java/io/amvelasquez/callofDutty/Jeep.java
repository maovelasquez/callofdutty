package io.amvelasquez.callofDutty;

public class Jeep extends Vehiculo implements Atacable, Rafagable{

    public int capacidadPasajeros = 4;
    public int capacidadTonelaCarga = 5;
    public String tipoArmamento = "pistolas";
    public int capacidadMunicion = 1000;

    public Jeep(int capacidadPasajeros, int capacidadTonelaCarga, String tipoArmamento, int capacidadMunicion){
        super(capacidadPasajeros, capacidadTonelaCarga, tipoArmamento, capacidadMunicion);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadTonelaCarga = capacidadTonelaCarga;
        this.tipoArmamento = tipoArmamento;
        this.capacidadMunicion = capacidadMunicion;
    }

    public Jeep() {

    }

    public void doAtaque() {

        System.out.println("Atacando desde un Jeep con " + capacidadPasajeros + " pasajeros ");

    }

    public void doRafaga() {

        System.out.println("disparando rafagas de Ametralladora desde un Jeep");

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

    @Override
    public String getTipoArmamento() {
        return tipoArmamento;
    }

    public void setTipoArmamento(String tipoArmamento) {
        this.tipoArmamento = tipoArmamento;
    }

    @Override
    public int getCapacidadMunicion() {
        return capacidadMunicion;
    }

    public void setCapacidadMunicion(int capacidadMunicion) {
        this.capacidadMunicion = capacidadMunicion;
    }
}
