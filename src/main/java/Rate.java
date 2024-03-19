import java.util.UUID;

public class Rate {
    final UUID raterId;
    final UUID subjectId;
    final UUID courseId;
    double rating;

    Rate (UUID raterId , UUID subjectId , UUID courseId , double rating) {
        this.raterId = raterId;
        this.subjectId = subjectId;
        this.courseId = courseId;
        this.rating = rating;

    }

}
