package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App implements Home {

    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        Collections.sort(homes, (home1, home2) -> Double.compare(home1.getArea(), home2.getArea()));

        List<String> result = homes.stream()
                .limit(n)
                .map(Object::toString)
                .collect(Collectors.toList());

        return result;
    }
}
// END
