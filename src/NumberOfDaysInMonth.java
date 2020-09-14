public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println(-1);
            return -1;
        }
        if (year < 1 || year > 9999) {
            System.out.println(-1);
            return -1;
        } else if (month == 3) {
            System.out.println(31);
            return 31;
        } else if (month == 4) {
            System.out.println(30);
            return 30;
        } else if (month == 5) {
            System.out.println(31);
            return 31;
        } else if (month == 6) {
            System.out.println(31);
            return 30;
        } else if (month == 7) {
            System.out.println(31);
            return 31;
        } else if (month == 8) {
            System.out.println(31);
            return 31;
        } else if (month == 9) {
            System.out.println(30);
            return 30;
        } else if (month == 10) {
            System.out.println(31);
            return 31;
        } else if (month == 11) {
            System.out.println(30);
            return 30;
        } else if (month == 12) {
            System.out.println(31);
            return 31;
        }
        if (month == 1) {
            System.out.println(31);
            return 31;
        } else if (month == 2 && isLeapYear(year)) {
            System.out.println(29);
            return 29;
        } else {
            System.out.println(28);
            return 28;
        }
    }
}
