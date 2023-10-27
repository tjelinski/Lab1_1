// tjelinski@student.wsb-nlu.edu.pl
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter main information about the student: ");
        System.out.println("Name and surname");
        String nameSurname = scanner.nextLine();
        System.out.println("University");
        String university = scanner.nextLine();
        System.out.println("Field of Study");
        String fieldOfStudy = scanner.nextLine();

        System.out.println("Information about student");
        System.out.println("Name and Surname: " + nameSurname);
        System.out.println("Field of study: " + fieldOfStudy);
        System.out.println("University: " + university);

        scanner.close();
    }
}