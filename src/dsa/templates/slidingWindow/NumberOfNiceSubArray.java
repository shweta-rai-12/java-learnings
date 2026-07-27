package dsa.templates.slidingWindow;

public class NumberOfNiceSubArray {

    // The catch in the problem is that we need to count the number of subarrays with exactly k odd numbers.
    // We can use a sliding window approach to solve this problem.
    // check again it might be wrong
    public static int niceSubArray(int[] arr, int k){
        int left=0, right=0;
        int sum=0;
        int subArray =0;
        while(right < arr.length){
            sum+=arr[right]%2;
            while(sum>k){
                sum = sum - arr[left]%2;
                left++;
            }
            subArray = Math.max(subArray,right-left+1);
            right++;
        }
        return subArray;
    }

    // SOmething is wrong check when your free
    public static int niceSubArray1(int[] arr, int k) {
        int left = 0, right = 0, sum = 0, subArrays =0;
        while (right < arr.length) {
            if (arr[right] >= 2 && arr[right] % 2 == 0) {
                right++;
                continue;
            }
            sum += arr[right];
            if(sum == k){
                subArrays++;
            }
            else if(sum > k && left < right){
                if(!(arr[left]%2 == 0 && arr[left]<2)){
                    sum -= arr[left];
                    left++;
                }
            }
            right++;
        }
        return subArrays;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        int k =3;
        System.out.println("Count the Number of Nice SubArrays where the odd number sums equal to k : " + (niceSubArray(arr,k)-niceSubArray(arr,k-1)));
    }
}
