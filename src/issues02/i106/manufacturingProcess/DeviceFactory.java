package issues02.i106.manufacturingProcess;

import issues02.i106.manufacturingProcess.processes.GeneralManufacturingProcess;
import issues02.i106.manufacturingProcess.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {

        GeneralManufacturingProcess manufacturingProcess = new SmartphoneManufacturingProcess( "Iphone" );
        manufacturingProcess.launchProcess();

    }

}
