package exercise;

import java.util.List;
import exercise.Home;

// BEGIN
class App implements Home {

    public static List<String> buildApartmentsList(List<Home> apartments, int count) {
        return apartments.stream()
            .sorted(Home::compareTo)
            .limit(count)
            .map(Home::toString)
            .toList();
    }
}
// END
