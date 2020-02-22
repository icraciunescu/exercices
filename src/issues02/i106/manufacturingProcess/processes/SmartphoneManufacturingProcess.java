package issues02.i106.manufacturingProcess.processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String name) {
        super( name );
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled Smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested Smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged Smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored Smartphone");
    }

}
