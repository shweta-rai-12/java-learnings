package dsa.templates.hashing;

import java.util.HashMap;

public class TwoSum {

    //Using HashMap
    public static int[] twoSum(int[] nums, int target) {

        if(nums==null||nums.length==0)
            return new int[]{-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15,4,7,12,6};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
    }

}
