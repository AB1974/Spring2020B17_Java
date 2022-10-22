package day54_Maps;

import OfficeHours.Practice_04_29_2020.ArrayList_Methods;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {
        //key username, value password
        LinkedHashMap<String, String> Facebook = new LinkedHashMap<>();
        Facebook.put("Tester01", "password1");
        Facebook.put("Tester02", "password1");
        Facebook.put("Tester02", "password2");//duplicate last one will be kept in the memory
        Facebook.put("Tester03", "password3");
        Facebook.put("Tester04", "password4");
        Facebook.put("Tester05", "password5");

        System.out.println(Facebook.size());
        System.out.println(Facebook);
        System.out.println("============");
        for (String eachKey : Facebook.keySet()) {
            System.out.println(eachKey);
            //  System.out.println(eachKey+" "+Facebook.get(eachKey));

        }
        List<String> username = new ArrayList<>(Facebook.keySet());
        System.out.println(username);

        System.out.println("================");
        for (String eachValue : Facebook.values()) {
            System.out.println(eachValue);//returns you collectiontype
        }
        List<String> password = new ArrayList<>(Facebook.values());
        System.out.println(password);
    }
}
