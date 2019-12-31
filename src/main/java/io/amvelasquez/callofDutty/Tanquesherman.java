package io.amvelasquez.callofDutty;

public class Tanquesherman extends Vehiculo implements Atacable, Rafagable, Bombardeable {

    public int capacidadPasajeros = 5;
    public int capacidadTonelaCarga = 20;
    public String tipoArmamento = "Cañon largo";
    public int capacidadMunicion = 213;

    public Tanquesherman(int capacidadPasajeros, int capacidadTonelaCarga, String tipoArmamento, int capacidadMunicion) {
        super(capacidadPasajeros, capacidadTonelaCarga, tipoArmamento, capacidadMunicion);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadTonelaCarga = capacidadTonelaCarga;
        this.tipoArmamento = tipoArmamento;
        this.capacidadMunicion = capacidadMunicion;
    }

    public Tanquesherman() {

    }

    public void doAtaque() {

        System.out.println("Atacando desde un tanque de guerra sherman con " + capacidadPasajeros + " pasajeros");

    }

    public void doBombardear() {

        System.out.println("Bombardeando Atacando desde un tanque de guerra sherman");

    }

    public void doRafaga() {

        System.out.println("Disparando rafagas de Ametralladora desde un tanque de guerra sherman");

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
