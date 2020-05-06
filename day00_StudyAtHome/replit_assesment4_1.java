package day00_StudyAtHome;

import java.util.Arrays;

public class replit_assesment4_1 {

    public static boolean isSort(int[] nums) {

        int[]copy=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];

        }

        Arrays.sort(nums);
        boolean result = Arrays.equals(nums, copy);
        System.out.println(result);
        return result;
    } }