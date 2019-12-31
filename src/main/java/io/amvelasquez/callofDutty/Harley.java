package io.amvelasquez.callofDutty;

public class Harley extends Vehiculo implements Atacable, Balinable {

    public int capacidadPasajeros = 2;
    public int capacidadTonelaCarga = 1;
    public String tipoArmamento = "metralleta";
    public int capacidadMunicion = 60;

    public Harley(int capacidadPasajeros, int capacidadTonelaCarga, String tipoArmamento, int capacidadMunicion) {
        super(capacidadPasajeros, capacidadTonelaCarga, tipoArmamento, capacidadMunicion);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadTonelaCarga = capacidadTonelaCarga;
        this.tipoArmamento = tipoArmamento;
        this.capacidadMunicion = capacidadMunicion;
    }

    public Harley() {
        super();

    }

    public void doAtaque() {

        System.out.println("Atacando desde una moto Harley Davison con " + capacidadPasajeros + " pasajeros ");

    }

    public void doBalin() {
        System.out.println("Disparando balines desde una moto Harley Davison");

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
