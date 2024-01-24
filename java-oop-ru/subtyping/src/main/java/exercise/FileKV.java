package exercise;

import java.util.Map;

public class FileKV implements KeyValueStorage {

    private final String filePath;
    private Map<String, String> storage;

    public FileKV(String filePath, Map<String, String> initialData) {
        this.filePath = filePath;
        this.storage = initialData;
        saveToFile();
    }

    private void saveToFile() {
        String serializedData = Utils.serialize(storage);
        Utils.writeFile(filePath, serializedData);
    }

    private void loadFromFile() {
        String serializedData = Utils.readFile(filePath);
        storage = Utils.unserialize(serializedData);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
        saveToFile();
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
        saveToFile();
    }

    @Override
    public String get(String key, String defaultValue) {
        loadFromFile();
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        loadFromFile(); 
        return storage;
    }
}
