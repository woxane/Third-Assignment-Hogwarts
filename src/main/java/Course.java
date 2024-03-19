import java.util.ArrayList;
import java.util.UUID;

public class Course {
    final String title;
    final UUID courseID;
    String assignment;
    static ArrayList<Student> students = new ArrayList<>();
    Teacher teacher;

    Course (String title , Teacher teacher) {
        this.title = title;
        this.courseID = UUID.randomUUID();
        this.assignment = "";
        this.teacher = teacher;
    }
}
