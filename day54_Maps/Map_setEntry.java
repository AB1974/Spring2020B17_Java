package day54_Maps;

import java.security.KeyStore;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {
    public static void main(String[] args) {
        //country,city
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("Tajikistan", "Dushanbe");
        countries.put("Kyrgyztan", "Bishkek");
        countries.put("East Turkistan", "Urumqi");
        countries.put("Usa", "Washington DC");
        countries.put("Pakistan", "Islamabad");

        String input = "Usa";
        for (Map.Entry<String, String> each : countries.entrySet()) {
            // System.out.println(each.getKey()+"'s capital is : "+each.getValue());
            String countryName = each.getKey();
            String cityName=each.getValue();

            if(input.equalsIgnoreCase(countryName)){
                System.out.println(cityName);
            }
        }
    }

}
