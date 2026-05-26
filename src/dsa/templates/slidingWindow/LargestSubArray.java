package dsa.templates.slidingWindow;

public class LargestSubArray {

    //Longest Sub Array with sum less than or equal to k - Method -1 - Brute Force
    public static int maxSubArray(int[] arr, int k) {
        int sum=0, maxSum=0;
        for(int j=0;j<arr.length-1;j++){
            sum +=arr[j];
            for(int i=j+1;i<arr.length;i++){
                sum +=arr[i];
                if(sum >k)
                    break;
                maxSum=Math.max(sum,maxSum);
            }
            sum=0;
        }
        return maxSum;
    }

    // Method 2 - Optimal solution
    public static int maxSubArray2(int[] arr, int k) {
        int sum=0, maxLength=Integer.MIN_VALUE;
        int l=0, r=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>k){
                sum=sum-arr[l];
                l=l+1;
            }
            if (sum<=k){
                maxLength=Math.max(maxLength,r-l+1);
            }
            r++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {1,6,2,8,2,5};
        int k=12;
        System.out.println("The length of the longest sub array with sum less than or equal to " + k + " is: " + maxSubArray(arr, k));
        System.out.println("The length of the longest sub array with sum less than or equal to " + k + " is: " + maxSubArray2(arr, k));
    }
}
