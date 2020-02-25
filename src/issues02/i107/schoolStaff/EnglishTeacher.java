package issues02.i107.schoolStaff;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("taught english");
    }

}
