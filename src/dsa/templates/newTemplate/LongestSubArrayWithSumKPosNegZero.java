package dsa.templates.newTemplate;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumKPosNegZero {

    public static int longestSubArrayWithSumK(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(sum == k)
                max = Math.max(max, i+1);
            map.putIfAbsent(sum, i);
            if(map.containsKey(sum - k)){
                max = Math.max(max, i-map.get(sum - k));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,-1,5,-3,4,-1,2,1,-5,0};
        int k = 3;
        System.out.println("Length of longest subarray which includes negative & positive with sum "
                + k + " is: " + longestSubArrayWithSumK(arr, k));
    }
}
