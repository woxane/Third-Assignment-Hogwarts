import java.util.UUID;

public class Rate {
    final UUID raterId;
    final UUID subjectId;
    double rating;

    Rate (UUID raterId , UUID subjectId , double rating) {
        this.raterId = raterId;
        this.subjectId = subjectId;
        this.rating = rating;

    }

}
