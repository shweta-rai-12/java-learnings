package dsa.templates.slidingWindow;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int l=0, r=0;
        while(r<nums.length){
            if(nums[r]==1){
               max = Math.max(max,r-l+1);
            }else{
                l = r+1;
            }
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,1,1,1,1,1,0,0};
        System.out.println("Max consecutive ones: " + findMaxConsecutiveOnes(arr));
    }
}
