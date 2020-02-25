package issues02.i107.schoolStaff;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("taught science");
    }

}
