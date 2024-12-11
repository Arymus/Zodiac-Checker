import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object

        System.out.println("Astrology Checker");
        System.out.println("Enter your date of birth in the format M/D/YYYY.");

        String birthday = scanner.nextLine();
        String[] birthdayArray = birthday.split("/");

        int month = Integer.parseInt(birthdayArray[0]);
        int day = Integer.parseInt(birthdayArray[1]);
        int year = Integer.parseInt(birthdayArray[2]);

        if (birthdayArray.length != 3) {
            System.out.println("Input your birthdate as M/D/YYYY.");
        };

        String monthStr = null;
        int daysInMonth;

        switch (month) {
            case 1:
                monthStr = "Jan";
                daysInMonth = 31;
                break;
            case 2:
                monthStr = "Feb";
                daysInMonth = 28;
                break;
            case 3:
                monthStr = "Mar";
                daysInMonth = 31;
                break;
            case 4:
                monthStr = "Apr";
                daysInMonth = 30;
                break;
            case 5:
                monthStr = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthStr = "Jun";
                daysInMonth = 30;
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
                daysInMonth = 30;
                break;
            case 10:
                monthStr = "Oct";
                daysInMonth = 31;
                break;
            case 11:
                monthStr = "Nov";
                daysInMonth = 30;
                break;
            case 12:
                monthStr = "Dec";
                daysInMonth = 31;
                break;
        }

        String horoscope = null;

        if (month == 1 && day >= 20 || month == 2 && day <= 18) {
            horoscope = "Aquarius";
        } else if (month == 2 && day >= 19 ||  month == 3 && day <= 21) {
            horoscope = "Pisces";
        } else if (month == 3 && day >= 21 || month == 4 && day <= 19) {
            horoscope = "Aries";
        } else if (month == 4 && day >= 20 || month == 5 && day <= 20) {
            horoscope = "Taurus";
        } else if (month == 5 && day >= 21 || month == 6 && day <= 21) {
            horoscope = "Gemini";
        } else if (month == 6 && day >= 22 || month == 7 && day <= 22) {
            horoscope = "Cancer";
        } else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
            horoscope = "Leo";
        } else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
            horoscope = "Virgo";
        } else if (month == 9 && day >= 23 || month == 10 && day <= 23) {
            horoscope = "Libra";
        } else if (month == 10 && day >= 24 || month == 11 && day <= 21) {
            horoscope = "Scorpio";
        } else if (month == 11 && day >= 22 || month == 12 && day <= 21) {
            horoscope = "Sagittarius";
        } else {
            System.out.println("Please follow the input of M/D/YYYY.");
        };

        System.out.println("Your birthday is: " + monthStr + " " + day + ", " + year);

        if (horoscope == "Aries" || horoscope == "Aquarius") {
            System.out.println("You are an " + horoscope);
        } else {
            System.out.println("You are a " + horoscope);
        };


    }
}
