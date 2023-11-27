package exercise;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Spring;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence){
        Map<String, Integer> result = new HashMap<>();
        if (sentence.isEmpty()){
            return result;
        } else {
            String[] splitSentence = sentence.split(" ");
            for (String count : splitSentence) {
                if (result.containsKey(count)){
                    int i = result.get(count);
                    result.put(count,i + 1);
                } else {
                    result.put(count, 1);
                }
            }
        }
        return result; 
    }

    public static String toString(Map <String , Integer> map){
        if (map.isEmpty()) {
            return "{}";
        } else {
        String result = "{\n";
        for (Map.Entry<String,Integer> word: map.entrySet()){
            result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        result = result + "}";
        return result.toString();
    }
}

    public static void main(String[] args) {
        Map wordsCount2 = App.getWordCount("");
        String result2 = App.toString(wordsCount2);
        System.out.println(result2);
    }
}
//END
