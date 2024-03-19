import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Account {
    static final String role = "Student";
    ArrayList<Course> courses = new ArrayList<>();

    Student(String username, String password, String role) {
        super(username, password, role);
    }
    public void takeCourse() {
        if (Hogwarts.courses.isEmpty()) {
            System.out.println("Sorry there is no course for now </3 .");
        } else {
            System.out.println("We have the above courses .\nChoose one of the above : ");
            Hogwarts.viewAllCourses();

            Scanner scanner = new Scanner(System.in);

            do {
                int chosenCourse = scanner.nextInt();

                if (!(chosenCourse >= Hogwarts.courses.size() | chosenCourse <= 0)) {
                    Course course = Hogwarts.courses.get(chosenCourse - 1);
                    course.students.add(this);
                    this.courses.add(course);
                    System.out.println("Done .");
                    break;
                } else {
                    System.out.println("Please choose one of the above : ");
                }

            } while (true);

        }

    }

    public void viewCourses() {
        int i = 1;
        for (Course course : courses ) {
            System.out.println(i + ") " + "Title : " + course.title + "\nTeacher Name : " + course.teacher +
                    "\nAssignments : " + course.assignment);
            i++;
        }
    }

    public void viewTeachers() {
        Hogwarts.viewAllTeachers();
    }
}
