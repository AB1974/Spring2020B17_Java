package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Aylin", 120000.0);
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Bahadir", 130000.0);//put(key,value)
        System.out.println(employeeInfo.size());//size 2
        //  System.out.println( employeeInfo.get(0));there is no index number
        //Key has to be unique
        //put(key,value);
        //get(key); returns value
        //remove(key);
        //containsKey(key);returns boolean
        //containsValue(value);returns boolean
        //keySet();gives you all keys, returns as SET ,does not accept duplicate
        //values();gives you all values, returns the values as collection
        //entrySet();gives you all list
        //isEmpty();returns boolean
        //clear();//after type clear size will be zero
        //key can not be duplicated!
        //value can be duplicated
        //Map accepts Object only !!!no primitives

        //Entry<Key, Value> Entry Interface
        //getKey();returns the key from the Entry
        //getValue();returns the value from the Entry

        System.out.println(employeeInfo.get("Aylin"));//gives value
        System.out.println(employeeInfo.get("Bahadir"));//gives value

        employeeInfo.remove("Bahadir");
        System.out.println(employeeInfo);//size 1
        System.out.println(employeeInfo.size());

        employeeInfo.put("Aylin", 135000.0);//you can not add same key !!!
        //if you add the last one will stay in the map!!
        //first one will go away!
        System.out.println(employeeInfo);


    }
}
