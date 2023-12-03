package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
public static Integer getCountOfFreeEmails(List<String> emailList){
    long countFreeEmails = emailList.stream()
        .filter(email -> email.contains("gmail.com") || email.contains("hotmail.com") || email.contains("yandex.com")).count();
        return(int) countFreeEmails;
}
}

