package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashMap;

// BEGIN
class App<K extends String, V extends String> {
    public List<Map<K, V>> findWhere(List<Map<K, V>> books, Map<K, V> search) {
        List<Map<K, V>> searchResult1 = new ArrayList<>();
        for (Map<K, V> book : books) {
            if (book.get("author").equals(search.get("author")) && book.get("year").equals(search.get("year"))) {
                searchResult1.add(book);
            }
        }
        return searchResult1;
    }
}