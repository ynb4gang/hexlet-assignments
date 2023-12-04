package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] DuplicateValue(String[] items){
        return Arrays.stream(items)
            .flatMap(item -> Arrays.stream(new String[] {item,item}))
            .toArray(String[]::new);
    }
    public static String[][] enlargeArrayImage(String[][] image){
        String[][] horizontalyStretched = Arrays.stream(image)
            .map(App::DuplicateValue)
            .toArray(String[][]::new);
            
            return Arrays.stream(horizontalyStretched)
                .flarmap(item -> Arrays.stream(new String[][] {item, item}))
                .toArray(String[][]::new);
    }
}
// END
