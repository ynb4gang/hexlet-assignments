package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1,Map<String, Object> data2) {
        Set<String> allKeys= new TreeSet<>(data1.keySet());
        allKeys.addAll(data2.keySet());
        Map<String, String> result = new LinkedHashMap<>();
        for (String key : allKeys){
            if(data1.containsKey(key) && data2.containsKey(key)){
                result.put(key,"unchanged");
            }
            else {
                result.put(key, "changed");
            }
            else if (data1.containsKey(key)) {
                result.put(key, "deleted");
            } else if (data2.containsKey(key)) {
                result.put(key, "added");
            }
        }
        return result
    }
}
//END
