package dsa.templates.slidingWindow;

public class TwoPointer {

    /**
     * Two Pointer :
     * @param arr
     * @param window
     * @return
     */
    public static int twoPointer(int[] arr, int window){
        int l =0;
        int r = window-1;
        int sum=0, maxSum=0;

        // Initializing the sum with addition of first window
        for(int j=0;j<=r;j++){
            sum+=arr[j];
        }
        maxSum=sum;

        // sliding window logic
        while(r<arr.length-1){
            sum -=arr[l];
            l++;
            r++;
            sum +=arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,3,4,-5,6,2,2,-1};
        int window = 4;
        System.out.println("The max sum of window of size " + window + " is: " + twoPointer(arr, window));
    }

}
