package issues02.i106.manufacturingProcess.processes;

public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String name) {
        processName = name;
    }

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    public void launchProcess() {

        if (processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("no process file was specified");
        }

    }

}
