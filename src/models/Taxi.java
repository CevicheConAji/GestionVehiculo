package models;

import java.util.ArrayList;

public class Taxi extends Vehicle{

    private String licence;
    private static ArrayList<Conductor> conductores = new ArrayList<>();

    public Taxi(String licenPlate, String model, int potemciaCV, String licence) {
        super(licenPlate, model, potemciaCV);
        this.licence = licence;
    }

    public Taxi() {
    }

    public static void adConductor(Conductor c){
        conductores.add(c);
    }
    public static void imprimirListaConductores(){
        for(Conductor c : conductores){
            System.out.println(c.toString());
        }
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public void stopEngine() {
        System.out.println("Se paro la maquima!!!");
    }

    @Override
    public void start() {
        System.out.println("Inicia el Taxi con placa: "+ getLienPlate());
    }
    @Override
    public String toString() {
        return super.toString() +
                this.getClass().getName() +
                "licence='" + licence + '\'' +
                '}';
    }

}
