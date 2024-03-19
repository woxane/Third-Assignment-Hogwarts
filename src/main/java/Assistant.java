import java.util.Scanner;

public class Assistant extends Account {
    static final String role = "Admin";
    Assistant(String username, String password, String role) {
        super(username, password, role);
    }

    public void remove() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You want to Remove a :\n\t1) Teacher    2) Student");

        int input = scanner.nextInt();

        if (input == 1) {
            if (Hogwarts.teachers.isEmpty()) {
                System.out.println("Sorry there is no teacher added until now .");
            } else {
                System.out.println("Please choose one of the above teacher : ");
                Hogwarts.viewAllTeachers();

                do {
                    int chosenTeacher = scanner.nextInt();

                    if (!(chosenTeacher >= Hogwarts.teachers.size() | chosenTeacher <= 0)) {
                        System.out.println("Are you sure you want to delete this teacher ? \n\t 1) Yes   2) No");

                        int userDecide = scanner.nextInt();

                        if (userDecide == 1) {
                            Hogwarts.teachers.remove(chosenTeacher - 1);

                        } else if (userDecide == 2) {
                            System.out.println("Ok .");
                            return;
                        }
                        break;
                    } else {
                        System.out.println("Please choose one of the above . ");
                    }
                } while (true);
            }

        } else if (input == 2) {
            if (Hogwarts.students.isEmpty()) {
                System.out.println("Sorry there is no students added until now .");
            } else {
                System.out.println("Please choose one of the above students : ");
                Hogwarts.viewAllStudents();

                do {
                    int chosenStudent= scanner.nextInt();

                    if (!(chosenStudent >= Hogwarts.students.size() | chosenStudent <= 0)) {
                        System.out.println("Are you sure you want to delete this Student ? \n\t 1) Yes   2) No");

                        int userDecide = scanner.nextInt();

                        if (userDecide == 1) {
                            Hogwarts.students.remove(chosenStudent - 1);

                        } else if (userDecide == 2) {
                            System.out.println("Ok .");
                            return;
                        }
                        break;
                    } else {
                        System.out.println("Please choose one of the above . ");
                    }
                } while (true);
            }
        }
    }

    public void studentProfile(Student student) {
        System.out.println("Username : " + student.username);
        System.out.println("Student Id : " + student.accountID);

    }
}
