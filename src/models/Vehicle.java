package models;

import java.util.ArrayList;

public abstract class Vehicle {
    private String lienPlate;
    private String model;
    private int powerCV;
    private static ArrayList<Conductor> conductores = new ArrayList<>();

    public Vehicle(String licenPlate, String model, int potemciaCV) {
        this.lienPlate = licenPlate;
        this.model = model;
        this.powerCV = potemciaCV;
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

    public  void addConductor(Conductor c){
        conductores.add(c);
    }
    public static void imprimirListaConductores(){
        for(Conductor c : conductores){
            System.out.println(c.toString());
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "lienPlate='" + lienPlate + '\'' +
                ", model='" + model + '\'' +
                ", powerCV=" + powerCV +
                '}';
    }
}
