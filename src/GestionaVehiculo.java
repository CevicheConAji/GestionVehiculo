import models.Bus;
import models.Conductor;
import models.Taxi;
import models.Vehicle;

import java.util.ArrayList;
import java.util.LinkedList;

public class GestionaVehiculo {
    public static void main(String[] args) {
        LinkedList<Vehicle> taxis = new LinkedList<>();
        ArrayList<Conductor> conductores = new ArrayList<>();

        //testTaxi();
        //testBus();

    }
    public static void testTaxi(LinkedList<Vehicle> taxis, ArrayList<Conductor> conductores){
        Vehicle t1 = new Taxi();
        Vehicle t2 = new Taxi();
        Vehicle t3 = new Taxi();
        Vehicle t4 = new Taxi();


        Conductor t1_c1 = new Conductor();
        Conductor t1_c2 = new Conductor();
        Conductor t1_c3 = new Conductor();

        Conductor t2_c1 = new Conductor();
        Conductor t2_c2 = new Conductor();
        Conductor t2_c3 = new Conductor();

        Conductor t3_c1 = new Conductor();
        Conductor t3_c2 = new Conductor();
        Conductor t3_c3 = new Conductor();


        Conductor t4_c1 = new Conductor();
        Conductor t4_c2 = new Conductor();
        Conductor t4_c3 = new Conductor();

        taxis.add(t1);

        t1.addConductor(t1_c1);
        t1.addConductor(t1_c2);
        t1.addConductor(t1_c3);

        taxis.add(t2);

        t2.addConductor(t2_c1);
        t2.addConductor(t2_c2);
        t2.addConductor(t2_c3);

        taxis.add(t3);


    }
    public static void testBus(){
        Vehicle b1 = new Bus();
        b1.start();
    }
}