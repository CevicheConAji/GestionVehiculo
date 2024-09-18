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

        Vehicle t1 = new Taxi();
        Vehicle t2 = new Taxi();
        Vehicle t3 = new Taxi();
        Vehicle t4 = new Taxi();


        Conductor c1_t1 = new Conductor();
        Conductor c2_t1 = new Conductor();
        Conductor c3_t1 = new Conductor();

        Conductor c1_t2 = new Conductor();
        Conductor c2_t2 = new Conductor();
        Conductor c3_t2 = new Conductor();

        Conductor c1_t3 = new Conductor();
        Conductor c2_t3 = new Conductor();
        Conductor c3_t3 = new Conductor();


        Conductor c1_t4 = new Conductor();
        Conductor c2_t4 = new Conductor();
        Conductor c3_t4 = new Conductor();


        //testTaxi();
        //testBus();

    }
    public static void testTaxi(){
        Vehicle t1 = new Taxi();

        t1.start();

    }
    public static void testBus(){
        Vehicle b1 = new Bus();
        b1.start();
    }
}