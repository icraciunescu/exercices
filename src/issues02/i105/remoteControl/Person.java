package issues02.i105.remoteControl;

import issues02.i105.remoteControl.device.Device;
import issues02.i105.remoteControl.device.TV;

public class Person {

    public static void main(String[] args) {

        RemoteControl remoteControl = RemoteControl.getInstance();
        Device device = new TV();
        remoteControl.choosingDevice( device );
        remoteControl.clickOnButton();
        remoteControl.clickOffButton();

    }

}
