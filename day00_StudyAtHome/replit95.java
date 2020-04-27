package day00_StudyAtHome;
import java.util.*;

public class replit95 {


            public static void main(String[] args) {


                //TODO: write your code below


                int[] nums = {1, 1, 2, 3, 4, 3, 4};

                int count = 0;

                for (int i = 0; i < nums.length; i++) {
                    count = 0;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == nums[i]) {
                            count++;
                        }
                    }
                    if (count != 2) {
                        System.out.println(nums[i]);
                    }
                }
            }
}