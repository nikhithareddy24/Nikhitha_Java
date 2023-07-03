package main.java.EmptyOptionalDateTimeAPI;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DateRangeFinder {
    public static void main(String[] args) {
        // Example list of dates
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2022, 4, 15),
                LocalDate.of(2022, 2, 28),
                LocalDate.of(2022, 6, 30),
                LocalDate.of(2022, 1, 1)
        );

        LocalDate earliestDate = dates.stream()
                .min(LocalDate::compareTo)
                .orElse(null);

        LocalDate latestDate = dates.stream()
                .max(LocalDate::compareTo)
                .orElse(null);

        System.out.println("Earliest Date: " + earliestDate);
        System.out.println("Latest Date: " + latestDate);
    }
}

