package dsa.templates.slidingWindow;

import java.util.Arrays;

public class LargestSubArray {

    //Longest Sub Array with sum less than or equal to k - Method -1 - Brute Force
    public static int maxSubArray(int[] arr, int k) {
        int sum=0, maxSize=Integer.MIN_VALUE;
        for(int j=0;j<arr.length-1;j++){
            sum +=arr[j];
            for(int i=j+1;i<arr.length;i++){
                sum +=arr[i];
                if(sum<=k) {
                    maxSize=Math.max(maxSize,i-j+1);
                }else{
                    break;
                }
            }
            sum=0;
        }
        return maxSize;
    }

    // Method 2 - Better Solution
    public static int maxSubArray2(int[] arr, int k) {
        int sum=0, maxLength=Integer.MIN_VALUE;
        int l=0, r=0;
        int[] subArray = new int[arr.length];
        while(r<arr.length){
            sum+=arr[r];
            if(sum<=k){
                maxLength=Math.max(maxLength,r-l+1);
                subArray = Arrays.copyOfRange(arr, l, r+1);
            }
            while(sum>k){
                sum=sum-arr[l];
                l++;
            }
            r++;
        }
        System.out.println(" The Sub Array is: " + Arrays.toString(subArray));
        return maxLength;
    }

    // Method 3 - Optimized Solution
    public static int maxSubArray3(int[] arr, int k) {
        int sum=0, maxLength=Integer.MIN_VALUE;
        int l=0, r=0;
        int[] subArray = new int[arr.length];
        while(r<arr.length){
            sum+=arr[r];
            if(sum<=k){
                maxLength=Math.max(maxLength,r-l+1);
                subArray = Arrays.copyOfRange(arr, l, r+1);
            }
            if(sum>k){
                sum=sum-arr[l];
                l++;
            }
            r++;
        }
        System.out.println(" The Sub Array is: " + Arrays.toString(subArray));
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {1,6,2,8,2,5};
        int k=12;
        System.out.println("The length of the longest sub array with sum less than or equal to " + k + " is: " + maxSubArray(arr, k));
        System.out.println("The length of the longest sub array with sum less than or equal to " + k + " is: " + maxSubArray2(arr, k));
        System.out.println("The length of the longest sub array with sum less than or equal to " + k + " is: " + maxSubArray3(arr, k));
    }
}
