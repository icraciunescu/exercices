package issues02.i109.dependencyInjection;

public class Vehicle {

    Engine anEngine;

    public Vehicle(Engine anEngine) {
        this.anEngine = anEngine;
    }

    public void crankIgnition() {
        anEngine.startEngine();
        System.out.println("vehicle is running");
    }

}
