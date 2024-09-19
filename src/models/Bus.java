package models;

public class Bus extends Vehicle {
    private int numberPlace;

    public Bus(String licenPlate, String model, int potemciaCV, int numberPlace) {
        super(licenPlate, model, potemciaCV);
        this.numberPlace = numberPlace;
    }

    public Bus() {
    }

    public int getNumberPlace() {
        return numberPlace;
    }

    public void setNumberPlace(int numberPlace) {
        this.numberPlace = numberPlace;
    }

    @Override
    public void start() {
        System.out.println("Inicia el Bus con placa: "+ getLienPlate());
    }

    @Override
    public String toString() {
        return super.toString() +
                this.getClass().getName() +
                "numberPlace=" + numberPlace +
                '}';
    }

    @Override
    public void paySalary() {
        System.out.println("Se pado el salario del Bus: "+ this.getClass().getName() );
    }

    @Override
    public void hireVehicle() {
        System.out.println("Se contrató el Bus: "+ this.getClass().getName() );
    }

}
