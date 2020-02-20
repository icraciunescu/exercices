package issues02.i105.remoteControl.device;

public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    @Override
    public String toString() {
        return "TV";
    }
}
