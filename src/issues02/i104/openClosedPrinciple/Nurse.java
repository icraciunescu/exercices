package issues02.i104.openClosedPrinciple;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super( id, name, department, working );
        System.out.println("nurse in action");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

    private void checkVitalSigns() {
        System.out.println("checking vitals ...");
    }

    private void drawBlood() {
        System.out.println("drawing blood ...");
    }

    private void cleanPatientArea() {
        System.out.println("clean patient area ...");
    }

}
