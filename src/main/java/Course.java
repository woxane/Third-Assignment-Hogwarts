import java.util.UUID;

public class Course {
    final String title;
    final UUID courseID;
    String assignment;

    Course (String title) {
        this.title = title;
        this.courseID = UUID.randomUUID();
        this.assignment = "";
    }
}
