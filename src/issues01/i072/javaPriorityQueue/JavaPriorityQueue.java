package issues01.i072.javaPriorityQueue;

import java.util.*;

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner( System.in );
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {

        int totalEvents = Integer.parseInt( scan.nextLine() );
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add( event );
        }

        List<Student> students = priorities.getStudents( events );

        if (students.isEmpty()) {
            System.out.println( "EMPTY" );
        } else {
            for (Student st : students) {
                System.out.println( st.getName() );
            }
        }

    }

}

class Student {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> student_queue =
                new PriorityQueue( Comparator.comparing( Student::getCgpa ).reversed().thenComparing( Student::getName ).thenComparing( Student::getId ) );
        List<Student> students = new ArrayList<>();

        for (String e : events) {
            Scanner in = new Scanner( e );
            String event = in.next();
            if (event.equals( "ENTER" )) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int id = in.nextInt();
                Student student = new Student( id, name, cgpa );
                student_queue.add( student );
            } else if (event.equals( "SERVED" )) {
                student_queue.poll();
            }
            in.close();
        }

        Student first = student_queue.poll();

        if (first == null) {
            return students;
        } else {
            while (first != null) {
                students.add( first );
                first = student_queue.poll();
            }
            return students;
        }

    }

}



/*
https://www.hackerrank.com/challenges/java-priority-queue/problem
 */