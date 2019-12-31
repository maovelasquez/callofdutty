package io.amvelasquez.callofDutty;

public class Speedfigther extends Vehiculo implements Atacable, Laserable, Rafagable {

    public int capacidadPasajeros = 2;
    public int capacidadTonelaCarga = 11;
    public String tipoArmamento = "misil";
    public int capacidadMunicion = 250;

    public Speedfigther(int capacidadPasajeros, int capacidadTonelaCarga, String tipoArmamento, int capacidadMunicion) {
        super(capacidadPasajeros, capacidadTonelaCarga, tipoArmamento, capacidadMunicion);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadTonelaCarga = capacidadTonelaCarga;
        this.tipoArmamento = tipoArmamento;
        this.capacidadMunicion = capacidadMunicion;
    }

    public Speedfigther() {

    }

    public void doAtaque() {

        System.out.println("Atacando desde un avion Speed con " + capacidadPasajeros + " pasajeros ");
    }

    public void doLaser() {

        System.out.println("usando el laser  desde un avion Speed");

    }

    public void doRafaga() {

        System.out.println("Disparando rafagas de Ametralladora desde un avion Speed");

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
