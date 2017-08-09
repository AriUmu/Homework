package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class SOlutionMap {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("ice", "cherry");
        System.out.println(map);
       // map.containsKey()

        map.get("ice");
        map.put("ice", "apple");

        System.out.println(map);
        map.remove("ice");

    }
}
