import java.util.ArrayList;
import java.util.UUID;

public class Course {
    final String title;
    final UUID courseID;
    String assignment;
    static ArrayList<Student> students = new ArrayList<>();

    Course (String title) {
        this.title = title;
        this.courseID = UUID.randomUUID();
        this.assignment = "";
    }
}
