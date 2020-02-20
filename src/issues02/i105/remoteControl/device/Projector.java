package issues02.i105.remoteControl.device;

public class Projector implements Device {

    @Override
    public void turnOn() {
        System.out.println("projector is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("projector is turned OFF");
    }

    @Override
    public String toString() {
        return "Projector";
    }

}
