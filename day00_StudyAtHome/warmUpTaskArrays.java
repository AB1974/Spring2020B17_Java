package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUpTaskArrays {
    /*
    warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method
	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["B", "D"]
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {

            result.add(list.get(i));
        }
        for (int i = 0; i < 4; i++) {
            result.add(0);
        }
        System.out.println(result);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "B", "C", "D", "D"));

        for (String each : list2) {
            int count = 0;

                for (String each1 : list2) {
                    if (each == each1) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(each);

                }

            }
        }
    }