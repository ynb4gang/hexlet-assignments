package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
    public static void getCountOfFreeEmails(List<String> emailList) {
        int countFreeEmails = emailList.stream()
                .filter(email -> email.contains("gmail.com") || email.contains("hotmail.com") || email.contains("yandex.ru"))
                .count();
        System.out.println(countFreeEmails);
    }
}
