package dsa.templates.slidingWindow;

public class BinarySubArrayWithSum {

    public static int totalSubarraySum1(int[] arr, int goal) {
        int n = arr.length;
        int left=0,right=0;
        int max = 0;
        int sum=0;
        while(right<n){
            sum = sum + arr[right];
            while(sum > goal){
                sum = sum - arr[left];
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    public static int totalSubarraySum2(int[] arr, int goal) {
        int n = arr.length;
        int left=0,right=0;
        int max = 0;
        int sum=0;
        while(right<n){
            sum = sum + arr[right];
            while(sum > goal){
                sum = sum - arr[left];
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int goal = 2;
        int ans = totalSubarraySum1(arr,goal)-totalSubarraySum2(arr,goal);
//       Only using one method.
//      int ans = totalSubarraySum1(arr,goal)-totalSubarraySum1(arr,goal-1);
        System.out.println("Number of binary subarrays with sum " + goal + ": " + totalSubarraySum1(arr, goal));
    }
}
