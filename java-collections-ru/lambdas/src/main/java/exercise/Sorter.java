package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> takeOldestMans2(List<Map<String, String>> users) {
        return users.stream()
            .filter(user -> "male".equals(user.get("gender")))
            .sorted((user1, user2) -> {
                LocalDate date1 = LocalDate.parse(user1.get("Birthday"));
                LocalDate date2 = LocalDate.parse(user2.get("Birthday"));
                return date1.compareTo(date2);
            })
            .map(user -> user.get("name"))
            .collect(Collectors.toList());
    }
}

