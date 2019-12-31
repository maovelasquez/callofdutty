package io.amvelasquez.callofDutty;

public class Bombardero extends Vehiculo implements Bombardeable, Atacable {

    public int capacidadPasajeros = 500;
    public int capacidadTonelaCarga = 50;
    public String tipoArmamento = "Cañon";
    public int capacidadMunicion = 650;
    public int sumapasajeros;


    public Bombardero(int capacidadPasajeros, int capacidadTonelaCarga, String tipoArmamento,
                      int capacidadMunicion) {
        super(capacidadPasajeros, capacidadTonelaCarga, tipoArmamento, capacidadMunicion);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadTonelaCarga = capacidadTonelaCarga;
        this.tipoArmamento = tipoArmamento;
        this.capacidadMunicion = capacidadMunicion;
    }

    public Bombardero() {
        super();
    }

    public void doAtaque() {

        System.out.println("Atacando desde un bombardero" + " con " + capacidadPasajeros + " pasajeros ");

    }

    public void doBombardear() {

        System.out.println("Soltando bombas a discreción desde un bombardero");

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


