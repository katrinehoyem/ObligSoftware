public class leap_year {
    static boolean is_leap_year(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}