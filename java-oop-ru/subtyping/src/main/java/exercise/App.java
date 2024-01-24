package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        KeyValueStorage tempStorage = storage.toMap();

        storage.toMap().forEach((key, value) -> {
            tempStorage.set(value, key);
        });

        storage.toMap().forEach((key, value) -> {
            storage.unset(key);
            storage.set(value, tempStorage.get(value, value));
        });
    }
}
// END
