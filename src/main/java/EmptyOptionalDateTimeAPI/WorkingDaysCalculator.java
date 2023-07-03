package main.java.EmptyOptionalDateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingDaysCalculator {
    public static void main(String[] args) {
        // Example specific date
        LocalDate startDate = LocalDate.of(2023, 6, 15);

        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth()); // Last day of the month

        long workingDays = startDate.datesUntil(endDate.plusDays(1))
                .filter(date -> !isWeekend(date))
                .count();

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }

    private static boolean isWeekend(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}

