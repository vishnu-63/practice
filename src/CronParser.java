import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CronParser {

    public static void main(String[] args) {
        String cronExpression = "*/15 2-5,10 * 4-6,9 *"; // Example cron expression

        List<String> fields = Arrays.asList(cronExpression.split(" "));
        if (fields.size() != 5) {
            System.out.println("Invalid cron expression.");
            return;
        }

        int minute = parseField(fields.get(0), 0, 59);
        int hour = parseField(fields.get(1), 0, 23);
        List<Integer> daysOfMonth = parseFieldList(fields.get(2), 1, 31);
        List<Month> months = parseMonthField(fields.get(3));
        List<Integer> daysOfWeek = parseFieldList(fields.get(4), 0, 7);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextExecutionTime = calculateNextExecution(minute, hour, daysOfMonth, months, daysOfWeek, now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Next execution time: " + nextExecutionTime.format(formatter));
    }

    // Parse single field (minute, hour, day, month, dayOfWeek)
    private static int parseField(String field, int min, int max) {
        if (field.equals("*")) {
            return -1; // Wildcard for all values
        }
        return Integer.parseInt(field);
    }

    // Parse comma-separated list of values for a field
    private static List<Integer> parseFieldList(String field, int min, int max) {
        String[] parts = field.split(",");
        return Arrays.stream(parts)
                .mapToInt(Integer::parseInt)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    // Parse month field (converts month names to Month enum)
    private static List<Month> parseMonthField(String field) {
        String[] parts = field.split(",");
        return Arrays.stream(parts)
                .map(Month::valueOf)
                .collect(Collectors.toList());
    }

    // Calculate the next execution time after 'now' based on cron fields
    private static LocalDateTime calculateNextExecution(int minute, int hour, List<Integer> daysOfMonth,
                                                        List<Month> months, List<Integer> daysOfWeek,
                                                        LocalDateTime now) {
        LocalDateTime nextExecutionTime = now.plusMinutes(1); // Start checking from next minute

        while (true) {
            if (matchesCronFields(nextExecutionTime, minute, hour, daysOfMonth, months, daysOfWeek)) {
                return nextExecutionTime;
            }
            nextExecutionTime = nextExecutionTime.plusMinutes(1);
        }
    }

    // Check if given LocalDateTime matches the cron fields
    private static boolean matchesCronFields(LocalDateTime dateTime, int minute, int hour,
                                             List<Integer> daysOfMonth, List<Month> months,
                                             List<Integer> daysOfWeek) {
        if (minute != -1 && dateTime.getMinute() != minute) {
            return false;
        }
        if (hour != -1 && dateTime.getHour() != hour) {
            return false;
        }
        if (!daysOfMonth.isEmpty() && !daysOfMonth.contains(dateTime.getDayOfMonth())) {
            return false;
        }
        if (!months.isEmpty() && !months.contains(dateTime.getMonth())) {
            return false;
        }
        if (!daysOfWeek.isEmpty() && !daysOfWeek.contains(dateTime.getDayOfWeek().getValue())) {
            return false;
        }
        return true;
    }
}
