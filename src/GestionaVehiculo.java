import models.Bus;
import models.Conductor;
import models.Taxi;
import models.Vehicle;

import java.util.Collections;
import java.util.LinkedList;

public class GestionaVehiculo {
    public static void main(String[] args) {

        LinkedList<Taxi> taxis = new LinkedList<>();

        testTaxi(taxis);
        startAndStop(taxis);

        infoVehiculo(taxis);
        System.out.println("===================Conductores===================");

        for(Taxi t: taxis){
            t.ordenConductores();
        }

        infoVehiculo(taxis);
        System.out.println("===================taxis=========================");
        Collections.sort(taxis);
        infoVehiculo(taxis);

        //testBus();

    }
    public static void testTaxi(LinkedList<Taxi> taxis){
        Taxi t1 = new Taxi("ABC34","Mazda",12,"125");
        Taxi t2 = new Taxi("ABC35","Mazda",13,"123");
        Taxi t3 = new Taxi("ABC33","Mazda",14,"129");
        Taxi t4 = new Taxi("ABC36","Mazda",12,"120");


        Conductor t1_c1 = new Conductor(115,"Paco AKA pacoMerte",42);
        Conductor t1_c2 = new Conductor(1,"Jorge AKA Delegado",127);
        Conductor t1_c3 = new Conductor(123,"Izan AKA nazI",20);

        Conductor t2_c1 = new Conductor(110,"Nathalia AKA SmartPhone",36);
        Conductor t2_c2 = new Conductor(136,"Azael AKA ElConductor",21);
        Conductor t2_c3 = new Conductor(169,"Mario AKA ChatGPT",23);

        Conductor t3_c1 = new Conductor(153,"Marco AKA Stuart",10);
        Conductor t3_c2 = new Conductor(111,"Flor AKA Bingo",25);
        Conductor t3_c3 = new Conductor(132,"Pau AKA FrenteSinFin",32);


        Conductor t4_c1 = new Conductor(118,"Steven AKA Chimba",22);
        Conductor t4_c2 = new Conductor(120,"Oscar AKA CarlosVives (bicicleta)",40);
        Conductor t4_c3 = new Conductor(163,"Javier Tribaldos AKA Proyecto",26);

        taxis.add(t1);

        t1.addConductor(t1_c1);
        t1.addConductor(t1_c2);
        t1.addConductor(t1_c3);

        taxis.add(t2);

        t2.addConductor(t2_c1);
        t2.addConductor(t2_c2);
        t2.addConductor(t2_c3);

        taxis.add(t3);

        t3.addConductor(t3_c1);
        t3.addConductor(t3_c2);
        t3.addConductor(t3_c3);

        taxis.add(t4);

        t4.addConductor(t4_c1);
        t4.addConductor(t4_c2);
        t4.addConductor(t4_c3);


    }
    public static void startAndStop(LinkedList<Taxi> taxis){
        for(Vehicle v : taxis ){
            v.start();
            v.stopEngine();
        }
    }
    public static void infoVehiculo(LinkedList<Taxi> taxis){
        System.out.println("=================================================");
        for(Vehicle v : taxis ){
            System.out.println(v.toString());
            v.imprimirListaConductores();
        }

    }
    public static void testBus(){
        Vehicle b1 = new Bus();
        b1.start();
    }
}