package dsa.templates.slidingWindow;

public class LongestSubArrayWithSumK {

    public static int longestSubArrayWithSumK(int[] arr, int goal) {
        int left=0, right=0;
        int maxLength=0;
        int sum=0;
        while(right<arr.length){
            sum+=arr[right];
            if(sum>goal && left<right){
                sum -= arr[left];
                left++;
            }else if(sum ==goal){
                maxLength = Math.max(maxLength,right-left+1);
            }
            right++;
        }
        return maxLength;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,9,3,4,3,1};
        int sum = 11;
        System.out.println("Length of longest subarray with sum " + sum + " is: " + longestSubArrayWithSumK(arr, sum));
    }
}
