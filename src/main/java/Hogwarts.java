import java.util.ArrayList;

public class Hogwarts {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Rate> rates = new ArrayList<>();


    static public void viewAllTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println("Name : " + teacher.username + "\nRatings : " + teacher.getRating() +
                    " (with " + teacher.rating.size() + " votes)");
        }
    }

    static public void viewAllStudents() {
        for (Student student : students) {
            System.out.println("Name : " + student.username + "\nRatings : " + student.getRating() +
                    " (with " + student.rating.size() + " votes)");
        }
    }

    static public void viewAllCourses() {
        for (Course course : courses ) {
            System.out.println("Title : " + course.title + "\nTeacher Name : " + course.teacher +
                    "\nAssignments : " + course.assignment);

        }
    }
}
