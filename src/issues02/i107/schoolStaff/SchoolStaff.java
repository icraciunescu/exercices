package issues02.i107.schoolStaff;

public class SchoolStaff {

    private void makeAnnouncements() {
        System.out.println("made announcements");
    }

    private void takeAttendance() {
        System.out.println("took attendance");
    }

    private void collectPaperWork() {
        System.out.println("collect paper work");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendance();
        collectPaperWork();
    }

}
