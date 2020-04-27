package day00_StudyAtHome;

public class replit151_Uniquenumbers {

    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(nums[i] + ",");
            }
        }
        System.out.println("=========================");

        for (int each2 : nums) {
            int count = 0;
            for (int each : nums) {
                if (each2 == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }


        }
        System.out.println("=====================");

        for (int a = 0; a < nums.length; a++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[a] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[a]);
            }
        }
        System.out.println("=====================");
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }

        }


    }

}







