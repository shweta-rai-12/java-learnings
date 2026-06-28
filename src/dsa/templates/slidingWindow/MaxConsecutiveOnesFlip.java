package dsa.templates.slidingWindow;

public class MaxConsecutiveOnesFlip {

    public static int findMaxConsecutiveOnesAfterFlip(int[] nums, int flip) {
        int max = Integer.MIN_VALUE;
        int l=0, r=0, k=flip;
        while(r<nums.length){
            if(nums[r]==1){
                max = Math.max(max,r-l+1);
            }else if(k>0){
                max = Math.max(max,r-l+1);
                k--;
            }else{
                l=r+1;
                k=flip;
            }
            r++;
        }
        return max;
    }

    // Assume the problme is Longest Subarray with at most K zeros,
    // we can use sliding window technique to solve it in O(n) time complexity
    // and O(1) space complexity.
    public static int findMaxConsecutiveOnesAfterFlip2(int[] nums, int flip) {
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,1,1,1,1,1,0,0};
        int flip =2;
        System.out.println("Max consecutive ones after flipping " + flip + " zeros: " + findMaxConsecutiveOnesAfterFlip(arr, flip));
    }
}
