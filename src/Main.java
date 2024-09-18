import models.Bus;
import models.Taxi;
import models.Vehicle;

public class Main {
    public static void main(String[] args) {

        testTaxi();
        testBus();

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