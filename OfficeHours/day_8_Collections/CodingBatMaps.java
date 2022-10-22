package OfficeHours.day_8_Collections;
import java.util.Map;

public class CodingBatMaps {
    public Map<String, String> mapBully(Map<String, String> map) {

        if(!map.containsKey("a")) return map;

        String a = map.get("a");

        if(!a.isEmpty()){

            map.put("b", a);
            map.put("a","");

        }

        return map;

    }

    public Map<String, String> mapShare(Map<String, String> map) {

        map.remove("c");

        if(!map.containsKey("a")) return map;

        String a = map.get("a");

        if(!a.isEmpty()){

            map.put("b", a);

        }

        return map;

    }

    public Map<String, String> mapAB(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){

            String abValue = map.get("a") + map.get("b");
            map.put("ab", abValue);

        }

        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {

        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");

        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {

        if(map.containsKey("ice cream")) {

            String s = map.get("ice cream");

            if(!s.isEmpty()) {
                map.put("yogurt" , s);
            }

        }

        if(map.containsKey("spinach")) {

            String s = map.get("spinach");

            if(!s.isEmpty()) {
                map.put("spinach" , "nuts");
            }

        }


        return map;
    }

// a && b
// a & b
}
