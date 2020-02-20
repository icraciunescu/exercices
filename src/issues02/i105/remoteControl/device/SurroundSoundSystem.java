package issues02.i105.remoteControl.device;

public class SurroundSoundSystem implements Device {

    @Override
    public void turnOn() {
        System.out.println("surround sound system is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("surround sound system is turned OFF");
    }

    @Override
    public String toString() {
        return "Surround sound system";
    }

}
