package dsa.templates.slidingWindow;

public class MaxConsecutiveOnesFlip {

    // Assume the problem is Longest Subarray with at most K zeros,
    // we can use sliding window technique to solve it in O(n) time complexity
    // and O(1) space complexity.
    public static int findMaxConsecutiveOnesAfterFlip(int[] nums, int flip) {
        int max = Integer.MIN_VALUE;
        int l=0, r=0, zero=0;
        while(r<nums.length){
            if(nums[r]==0)
                zero++;
            while(zero>flip){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            if(zero<=flip)
                max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }


    //Most Optimal Solution
    public static int findMaxConsecutiveOnesAfterFlip2(int[] nums, int flip) {
        int max = Integer.MIN_VALUE;
        int l=0, r=0, zero=0;
        while(r<nums.length){
            if(nums[r]==0)
                zero++;
            if(zero>flip){
                if(nums[l]==0){zero--;}
                l++;
            }
            if(zero<=flip)
                max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,1,1,1,1,1,0,0};
        int flip =2;
        System.out.println("Max consecutive ones after flipping " + flip + " zeros: " + findMaxConsecutiveOnesAfterFlip(arr, flip));
        System.out.println("Max consecutive ones after flipping " + flip + " zeros: " + findMaxConsecutiveOnesAfterFlip2(arr, flip));
    }
}
