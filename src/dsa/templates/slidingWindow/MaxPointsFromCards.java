package dsa.templates.slidingWindow;

public class MaxPointsFromCards {

    /**
     * The array contains cards, each card has some point.
     * Now we have a window given of size k, we are allowed the pick
     * that size window from front or from back but not from
     * center or anything in middle.
     * We have to find the maximum value that can be picked from the array.
     * @param nums - The given card array
     * @param k - given window size
     * @return - The maximum
     */
    public static int maxPointsFromCards(int[] nums, int k) {
        if(k == 0 || nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int leftSum = 0, rightSum = 0, rIndex = n-1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= k-1; i++) {
            leftSum += nums[i];
        }
        maxSum = Math.max(maxSum, leftSum);
        for (int i = k-1; i >= 0; i--) {
            leftSum -= nums[i];
            rightSum += nums[rIndex];
            maxSum = Math.max(maxSum, leftSum + rightSum);
            rIndex--;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 1, 5, 5, 7, 1, 9,4};
        int k =5;
        System.out.print("The maximum value from the array that can be picked either from front or back but not from " +
                "center or anything in middle : ");
        System.out.print(maxPointsFromCards(arr, k));
    }
}
