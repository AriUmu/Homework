package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();




    }

    public Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream") || map.containsKey("spinach")){
            if(map.get("ice cream") != null){
                String key = map.get("ice cream");
                map.put("yogurt", key);
            }
            if(map.get("spinach") != null){
                map.get("spinach");
                map.put("spinach", "nuts");
            }
        }
        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        }
        if(map.containsKey("b") && !map.containsKey("a")){
            map.put("a", map.get("b"));
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
            if(map.containsKey("a") && map.containsKey("b")){
                String key = "a" + "b";
                String value = map.get("a") + map.get("b");
                map.put(key, value);
            }
            return map;
    }


    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            if(map.get("potato") != null)
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad")){
            if(map.get("salad") != null)
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()) {
                map.get("a");
                map.put("a", "");
                map.get("b");
                map.put("b", "");
            }
            if (map.get("a").length() > map.get("b").length()) {
                map.get("c");
                map.put("c", map.get("a"));
            } else {
                map.get("c");
                map.put("c", map.get("b"));
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String>  map = new HashMap<>();
        for(String word : strings){
           if(!map.containsKey(word.charAt(0))){
               String value = "";
               for (int i = 0; i < strings.length ; i++) {
                   if(strings[i].charAt(0) == word.charAt(0)){
                       value += strings[i];
                   }
               }
               map.put(String.valueOf(word.charAt(0)), value);
            }
        }
        return map;
    }


}
















