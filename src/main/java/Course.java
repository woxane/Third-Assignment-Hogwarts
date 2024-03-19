import java.util.ArrayList;
import java.util.UUID;

public class Course {
    final String title;
    final UUID courseID;
    String assignment;
    static ArrayList<Student> students = new ArrayList<>();
    static String teacher;

    Course (String title , String teacher) {
        this.title = title;
        this.courseID = UUID.randomUUID();
        this.assignment = "";
        this.teacher = teacher;
    }
}
