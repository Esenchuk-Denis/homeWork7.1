import java.time.LocalDate;

public class Main {
    //Task 1
    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " год явлется високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYear(int year) {
        printIsLeapYearResult(year, isLeap(year));
    }

    //Task 2
    public static void recommendVersion(int clientOs, int deviseYear) {
        boolean deviseOld = isDeviseOld(deviseYear);
        System.out.print("Установите ");
        if (deviseOld) {
            System.out.print("облегченную ");

        } else {
            System.out.print("обычную ");

        }
        System.out.print("версию для ");
        if (clientOs == 0) {
            System.out.print("iOS");
        } else {
            System.out.print("android");

        }
        System.out.println(" ");

    }

    public static boolean isDeviseOld(int year) {
        int currentYear = LocalDate.now().getYear();
        return year > currentYear  ;
    }
    //Task 3





    public static int deliveryDays(int km) {
        if (km > 0 && km <= 20) {
            return 1; // Доставка в пределах 20 км занимает сутки
        } else if (km > 20 && km <= 60) {
            return 2;// Доставка в пределах от 20 км до 60 км
        } else if (km > 60 && km <= 100) {
            return 3; // Доставка в пределах от 60 км до 100 км
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Task 1");
        printIsLeapYear(2001);
        System.out.println("Task 2");
        recommendVersion(1, 2016);
        System.out.println("Task 3");

        int days = deliveryDays(12);
        if (days > 0) {
            System.out.println("Потребуется " + days + " день/дня доставки.");
        } else System.out.println("Доставки нет.");
    }
}


