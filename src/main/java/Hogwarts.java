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
        //TODO
    }

    public void viewAllCourses() {
        //TODO
    }
}
