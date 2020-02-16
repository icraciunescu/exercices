package issues02.i104.openClosedPrinciple;

public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super( id, name, department, working );
        System.out.println("doctor in action");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatient();
    }

    private void prescribeMedicine() {
        System.out.println("prescribe medicine ...");
    }

    private void diagnosePatient() {
        System.out.println("diagnose patient ...");
    }

}
