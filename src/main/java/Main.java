import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an option : \n1) Login\n2) Sign Up\n3) Exit");
            int selectedOption = scanner.nextInt();

            if (selectedOption == 3) {
                break;
            }

            runMenu(selectedOption);
        }
    }

    public static void runMenu(int Option) {
        switch (Option) {
            case 1 :
                //Login
                break;

            case 2 :
                //Sign Up
                break;

            default :
                System.out.println("Wrong one FAM!");
        }
    }
}
