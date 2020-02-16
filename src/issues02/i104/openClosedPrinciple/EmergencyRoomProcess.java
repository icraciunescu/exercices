package issues02.i104.openClosedPrinciple;

public class EmergencyRoomProcess {

    public static void main(String[] args) {

        HospitalManagement hospitalManagement = new HospitalManagement();
        Employee peggy = new Nurse( 1, "Peggy", "emergency", true);
        hospitalManagement.callUpon( peggy );

        System.out.println();

        Employee susan = new Doctor( 2, "Susan", "emergency", true );
        hospitalManagement.callUpon( susan );

    }

}
