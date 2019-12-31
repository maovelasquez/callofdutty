package io.amvelasquez.callofDutty;

import com.sun.corba.se.impl.presentation.rmi.StubFactoryStaticImpl;

import java.util.ArrayList;

public class Principal {

    private static Object Tanquesherman;

    public static void main(String[] args) {


        Bombardero bombardero = new Bombardero();
        Camionsuministro camionsuministro = new Camionsuministro();
        Crucero crucero = new Crucero();
        Harley harley = new Harley();
        Jeep jeep = new Jeep();
        Portaaviones portaaviones = new Portaaviones();
        Speedfigther speedfigther = new Speedfigther();
        Tanquesherman tanquesherman = new Tanquesherman();


        ArrayList<Vehiculo> allVehiculo = new ArrayList<Vehiculo>();
        allVehiculo.add(bombardero);
        allVehiculo.add(camionsuministro);
        allVehiculo.add(crucero);
        allVehiculo.add(harley);
        allVehiculo.add(jeep);
        allVehiculo.add(portaaviones);
        allVehiculo.add(speedfigther);
        allVehiculo.add(tanquesherman);

        for (Vehiculo vehiculo : allVehiculo) {
            System.out.println(vehiculo);
        }

        ArrayList<Atacable> vehiculosqueatacan = new ArrayList<Atacable>();
        vehiculosqueatacan.add(bombardero);
        vehiculosqueatacan.add(harley);
        vehiculosqueatacan.add(jeep);
        vehiculosqueatacan.add(speedfigther);
        vehiculosqueatacan.add(tanquesherman);


        for (Atacable vehiculo : vehiculosqueatacan) {
            vehiculo.doAtaque();
            System.out.println();

        }

        ArrayList<Rafagable> ametralladoras = new ArrayList<Rafagable>();
        ametralladoras.add(jeep);
        ametralladoras.add(speedfigther);

        for (Rafagable ametralladora : ametralladoras) {
            ametralladora.doRafaga();
            System.out.println();

        }

        ArrayList<Bombardeable> bombarderos = new ArrayList<Bombardeable>();
        bombarderos.add(bombardero);


        for (Bombardeable bombarde : bombarderos) {
            bombarde.doBombardear();
            System.out.println();

        }

    }
}
