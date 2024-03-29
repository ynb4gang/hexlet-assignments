package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;


// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        List<Home> sortedHomes = homes.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .limit(n)
                .collect(Collectors.toList());
        List<String> result = sortedHomes.stream()
                .map(Home::toString)
                .collect(Collectors.toList());
        return result;
    }
}
// END
