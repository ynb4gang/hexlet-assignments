package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashMap;

// BEGIN
class App {
    public static void main(String[] args) {
        List<Map<String, String>> books = new ArrayList<>();

        Map<String, String> book1 = new HashMap<>(Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611"));
        Map<String, String> book2 = new HashMap<>(Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111"));
        Map<String, String> book3 = new HashMap<>(Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611"));
        Map<String, String> book4 = new HashMap<>(Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222"));
        Map<String, String> book5 = new HashMap<>(Map.of("title", "Still foooing", "author", "FooBar", "year", "3333"));

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Map<String, String> where = new HashMap<>(Map.of("author", "Shakespeare", "year", "1611"));

        List<Map<String, String>> result = findWhere(books, where);

        System.out.println(result);
    }
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> search) {
        List<Map<String, String>> searchResult1 = new ArrayList<>();
        for (Map<String, String> book : books) {
            if (book.get("author").equals(search.get("author")) && book.get("year").equals(search.get("year"))) {
                searchResult1.add(book);
            }
        }
        return searchResult1;
    }
}
//END

//END
