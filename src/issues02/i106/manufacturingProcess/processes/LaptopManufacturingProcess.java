package issues02.i106.manufacturingProcess.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String name) {
        super( name );
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled Laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested Laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged Laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored Laptop");
    }

}
