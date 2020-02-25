package issues02.i107.schoolStaff;

public class MathTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("taught math");
    }

}
