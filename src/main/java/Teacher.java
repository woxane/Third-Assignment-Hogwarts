import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Teacher extends Account {
    static final String role= "Teacher";
    ArrayList<Course> courses = new ArrayList<>();

    Teacher (String username , String password) {
        super(username , password , role);

    }

    public void takeCourse() {
        ArrayList<Course> courseWithOutTeacher = new ArrayList<>();

        for (Course course : Hogwarts.courses) {
            if (!Objects.equals(course.teacher , "")) {
                courseWithOutTeacher.add(course);
            }
        }

        if (courseWithOutTeacher.isEmpty()) {
            System.out.println("Sorry , But there is no course you can get for now");

        } else {
            System.out.println("We have the above courses .\nChoose one of the above :");

            int i = 1;
            Scanner scanner = new Scanner(System.in);

            for (Course course : courseWithOutTeacher) {
                    System.out.println(i + ") " + "Title : " + course.title);
                }


            do {
                int chosenCourse = scanner.nextInt();

                if (!(chosenCourse >= courseWithOutTeacher.size() | chosenCourse <= 0)) {
                    courseWithOutTeacher.get(i - 1).teacher = this;
                    courses.add(courseWithOutTeacher.get(i - 1));
                    break;

                } else {
                    System.out.println("Please choose between one of the above : ");
                }

            } while (true);

        }
    }
}
