package dsa.templates.twoPointerPattern;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return null;
        Arrays.sort(nums);
        int left =0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                return new int[] {nums[left],nums[right]};
            }else if(sum>target){
                right--;
            }else {
                left++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println("The two nums are "+Arrays.toString(twoSum(arr, target)) + " the targert is "+target);
    }
}
