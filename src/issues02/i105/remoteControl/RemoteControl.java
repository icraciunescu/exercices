package issues02.i105.remoteControl;

import issues02.i105.remoteControl.device.Device;

public class RemoteControl {

    private Device device = null;
    private static final RemoteControl INSTANCE = new RemoteControl();

    private RemoteControl() {
    }

    public static RemoteControl getInstance() {
        return INSTANCE;
    }

    public void choosingDevice(Device aDevice) {
        this.device = aDevice;
        System.out.println("I chose the device " + aDevice);
    }

    public void clickOnButton() {
        device.turnOn();
    }

    public void clickOffButton() {
        device.turnOff();
    }

}
