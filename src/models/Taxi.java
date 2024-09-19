package models;

import java.util.ArrayList;

public class Taxi extends Vehicle implements Comparable<Taxi> {

    private String licence;



    public Taxi(String licenPlate, String model, int powerCV, String licence) {
        super(licenPlate, model, powerCV);
        this.licence = licence;
    }

    public Taxi() {
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
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

    @Override
    public void paySalary() {
        System.out.println("Se pado el salario del Taxi: "+ this.getClass().getName() );
    }

    @Override
    public void hireVehicle() {
        System.out.println("Se contrató el Taxi: "+ this.getClass().getName() );
    }

    @Override
    public int compareTo(Taxi o) {
        int licenDiff = this.getLicence().compareTo(o.getLicence());

        if (licenDiff != 0) {
            return licenDiff;
        }

        int licenPlateDiff = this.getLicence().compareTo(o.getLicence());
        if (licenPlateDiff != 0) {
            return licenPlateDiff;
        }

        return this.getPowerCV() - o.getPowerCV();
    }


}
