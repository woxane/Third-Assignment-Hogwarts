import java.util.ArrayList;

public class Hogwarts {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Rate> rates = new ArrayList<>();
    static ArrayList<Assistant> Asssistants = new ArrayList<>();

    static public void viewAllTeachers() {
        int i = 1;
        for (Teacher teacher : teachers) {
            System.out.println(i + ") " + "Name : " + teacher.username + "\nRatings : " + teacher.getRating() +
                    " (with " + teacher.rating.size() + " votes)");
            i++;
        }
    }

    static public void viewAllStudents() {
        int i = 1;
        for (Student student : students) {
            System.out.println(i + ") " + "Name : " + student.username + "\nRatings : " + student.getRating() +
                    " (with " + student.rating.size() + " votes)");
            i++;
        }
    }

    static public void viewAllCourses() {
        int i = 1;
        for (Course course : courses ) {
            System.out.println(i + ") " + "Title : " + course.title + "\nTeacher Name : " + course.teacher +
                    "\nAssignments : " + course.assignment);
            i++;

        }
    }
}
