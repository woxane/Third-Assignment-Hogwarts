import java.util.ArrayList;

public class Hogwarts {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();


    public void viewAllTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println("Name : " + teacher.username + "\nRatings : " + teacher.rating +
                    " (with " + teacher.numberOfVotes + " votes)");
        }
    }

    public void viewAllStudents() {
        for (Student student : students) {
            System.out.println("Name : " + student.username + "\nRatings : " + student.rating +
                    " (with " + student.numberOfVotes + " votes)");
        }
    }

    public void viewAllCourses() {
        for (Course course : courses ) {
            System.out.println("Title : " + course.title + "\nTeacher Name : " + course.teacher +
                    "\nAssignments : " + course.assignment);

        }
    }
}
