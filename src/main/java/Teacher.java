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

    public void rateStudent() {
        if (courses.isEmpty()) {
            System.out.println("Sorry , But you have no active course to have student </3 .");

        } else {
            int i = 1;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose one of the above course : ");

            for (Course course : courses) {
                System.out.println(i + ") " + "Title : " + course.title);
                i++;

            }

            do {
                int chosenCourse = scanner.nextInt();

                if (!(chosenCourse >= courses.size() | chosenCourse <= 0)) {
                    Course course = courses.get(chosenCourse - 1);

                    if (course.students.isEmpty()) {
                        System.out.println("Sorry but chosen course has no students </3 .");

                    } else {
                        i = 1;

                        System.out.println("Choose one of the above students : ");

                        for (Student student : course.students) {
                            System.out.println(i + ") " + "Name : " + student.username);
                        }

                        do {
                            int chosenStudent = scanner.nextInt();

                            if (!(chosenStudent >= course.students.size() | chosenStudent <= 0)) {
                                Student student = course.students.get(chosenStudent - 1);

                                for (Rate rate : student.rating) {
                                    if (rate.courseId == course.courseID & rate.raterId == this.accountID) {
                                        System.out.println("you already rate this student ." +
                                                "\nDo you want to change it ? \n\t1) Yes   2) No");
                                        int input = scanner.nextInt();

                                        if (input == 1) {
                                            System.out.println("Enter your score (1.0 to 5.0) : ");
                                            double score = scanner.nextDouble();
                                            rate.rating = score;

                                            return;

                                        } else {
                                            System.out.println("Ok .");

                                            return;
                                        }
                                    }
                                }

                                System.out.println("Enter your score (1.0 to 5.0) : ");
                                double score = scanner.nextDouble();
                                Rate rate = new Rate(this.accountID , student.accountID , course.courseID , score);
                                student.rating.add(rate);

                                return;

                            } else {
                                System.out.println("Please choose one of the above : ");
                            }
                        } while (true);
                    }
                    break;

                } else {
                    System.out.println("Please choose one of the above : ");
                }
            } while(true);
        }
    }

    public void viewCourses() {
        Hogwarts.viewAllCourses();
    }

    public void viewStudents(Course course) {
        if (course.students.isEmpty()) {
            System.out.println("Sorry this course has no students . ");
        }

        for (Student student : course.students) {
            System.out.println("Name : " + student.username + "\nRatings : " + student.getRating() +
                    " (with " + student.rating.size() + " votes)");
        }
    }
}
