import java.util.*;
public class MonthDaysLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1–12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeap ? 29 : 28;
            default -> -1;
        };

        if (days == -1)
            System.out.println("Invalid month number!");
        else
            System.out.println("Days in month " + month + " of year " + year + ": " + days);
    }
}