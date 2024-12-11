import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object

        System.out.println("Astrology Checker");
        System.out.println("Enter your date of birth in the format M/D/YYYY.");

        String birthday = scanner.nextLine();
        String[] birthdayArray = birthday.split("/");

        int month = Integer.parseInt(String birthdayArray[0]);
        int day = Integer.parseInt(String birthdayArray[1]);
        int year = Integer.parseInt(String birthdayArray[2]);

        if (birthdayArray.length != 3) {
            System.out.println("Input your birthdate as M/D/YYYY.");
        };

        String monthStr;
        int daysInMonth;
        switch (month) {
            case 1:
                monthStr = "Jan";
                daysInMonth = 31
                break;
            case 2:
                monthStr = "Feb";
                break;
            case 3:
                monthStr = "Mar";
                daysInMonth = 31;
                break;
            case 4:
                monthStr = "Apr";
                break;
            case 5:
                monthStr = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthStr = "Jun";
                break;
            case 7:
                monthStr = "Jul";
                daysInMonth = 31;
                break;
            case 8:
                monthStr = "Aug";
                daysInMonth = 31;
                break;
            case 9:
                monthStr = "Sep";
                break;
            case 10:
                monthStr = "Oct";
                daysInMonth = 31;
                break;
            case 11:
                monthStr = "Nov";
                break;
            case 12:
                monthStr = "Dec";
                daysInMonth = 31;
                break;


        }
    }
}
