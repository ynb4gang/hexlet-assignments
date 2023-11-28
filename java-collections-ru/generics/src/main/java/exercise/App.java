package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static<K extends String, V extends String> List<Map<K, V>> findWhere(List<Map<K, V>> books, Map<K, V> search) {
        List<Map<K, V>> searchResult1 = new ArrayList<>();
        if(search.containsKey("title")) {
            for (Map<K, V> book : books) {
            if (book.get("author").equals(search.get("author")) && book.get("year").equals(search.get("year")) && book.get("title").equals(search.get("title"))) {
                searchResult1.add(book);
            }
        }
        } else  {
            for (Map<K, V> book : books) {
            if (book.get("author").equals(search.get("author")) && book.get("year").equals(search.get("year"))) {
                searchResult1.add(book);
            }
        }
    }
    return searchResult1;
    }
}
