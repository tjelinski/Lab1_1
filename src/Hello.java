// tjelinski@student.wsb-nlu.edu.pl
import java.util.Scanner;       //biblioteka java umożliwiająca wprowadzanie danych z klawiatury przez użytkownika [zawarta w pakiecie java.util]

public class Hello {        //publiczna klasa main [dostępna dla wszystkich]
    public static void main(String[] args) {        //publiczna statyczna metoda main
        Scanner scanner = new Scanner(System.in);   //obiekt Scanner o nazwie scanner do wprowadzania danych

        System.out.println("Enter main information about the student: ");   //blok 'zbierajacy' dane o osobie; System.out.println wyświetla żadane do wpr. dane
        System.out.println("Name and surname");
        String nameSurname = scanner.nextLine();    // 'zbiera' dane wpr. przez użytkownika i przypisuje do zmiennej
        System.out.println("University");
        String university = scanner.nextLine();
        System.out.println("Field of Study");
        String fieldOfStudy = scanner.nextLine();

        System.out.println("Information about student"); // 'wyświetlenie' zebranych danych
        System.out.println("Name and Surname: " + nameSurname);
        System.out.println("Field of study: " + fieldOfStudy);
        System.out.println("University: " + university);

        scanner.close();    // 'zamknięcie' obiektu Scanner, zakończenie wpr. danych i zwolnienie zasobów
    }
}