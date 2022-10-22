package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Map_Practice {
//create a map and store your classmate's names and birthday

    public static void main(String[] args) {

        Map<String, LocalDate> task1 = new LinkedHashMap<>();
        task1.put("John", LocalDate.of(1965, 06, 29));
        task1.put("Bill", LocalDate.of(1995, 01, 06));
        task1.put("Ahmed", LocalDate.of(1990, 03, 03));
        task1.put("Murad", LocalDate.of(1987, 04, 19));
        task1.put("Mary", LocalDate.of(1992, 02, 14));

        System.out.println(task1.keySet());
        System.out.println(task1.values());
        System.out.println(task1.entrySet());

    }

}

class Muhtar {

    public static void main(String[] args) {
        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Taha", LocalDate.of(1974, 04, 06));
        classMates.put("Anil", LocalDate.of(1974, 04, 06));
        classMates.put("Saban", LocalDate.of(1974, 04, 06));
        classMates.put("Anna", LocalDate.of(1974, 04, 06));
        classMates.put("Namik", LocalDate.of(1974, 04, 06));
        classMates.put("Yucel", LocalDate.of(1974, 04, 06));
        classMates.put("Namik", LocalDate.of(1990, 04, 06));//will be last one
        classMates.put("Anil", LocalDate.now());//will be last one


        System.out.println(classMates.size());//size is 6
        classMates.remove("Namik");
        System.out.println(classMates);
        System.out.println(classMates.get("Taha"));
        System.out.println(classMates.containsKey("Aylin"));//false
        System.out.println(classMates.containsKey("Anna"));//true
        System.out.println(classMates.containsValue(LocalDate.of(1974, 04, 06)));//true


    }
}