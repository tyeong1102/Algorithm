import java.util.*;
import java.io.*;

class Solution {
    public static int[] nums;
    public static char[] arr;
    
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        nums = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            nums[i] = num;
        }
        
        Arrays.sort(nums);
        
        answer = nums[0] + " " + nums[nums.length - 1];
        
        return answer;
    }
}