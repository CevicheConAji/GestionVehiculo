package models;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Vehicle implements Company{
    private String lienPlate;
    private String model;
    private int powerCV;
    private ArrayList<Conductor> conductores = new ArrayList<>();

    public Vehicle(String licenPlate, String model, int powerCV) {
        this.lienPlate = licenPlate;
        this.model = model;
        this.powerCV = powerCV;
    }

    public Vehicle() {
    }


    public String getLienPlate() {
        return lienPlate;
    }

    public void setLienPlate(String lienPlate) {
        this.lienPlate = lienPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerCV() {
        return powerCV;
    }

    public void setPowerCV(int powerCV) {
        this.powerCV = powerCV;
    }

    public abstract void start();

    public void stopEngine() {
        System.out.println("Se paro la maquima!!!");
    }
    public void ordenConductores(){
        Collections.sort(conductores);
    }

    public void addConductor(Conductor c){
        conductores.add(c);
    }
    public void imprimirListaConductores(){
        for(Conductor c : conductores){
            System.out.println("\t\t-"+c.toString());
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " lienPlate='" + lienPlate + '\'' +
                ", model='" + model + '\'' +
                ", powerCV=" + powerCV +
                '}';
    }
}
