package Techmm;
enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumEx {
    static void checkHoliday(DaysOfWeek day) {
        if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
            System.out.println(day + " is a Holiday");
        } else {
            System.out.println(day + " is Not a Holiday");
        }
    }

    public static void main(String[] args) {
        checkHoliday(DaysOfWeek.MONDAY);
        checkHoliday(DaysOfWeek.SATURDAY);
    }
}
