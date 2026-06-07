package blind_75;

import java.util.Arrays;

public class ATwoSum {

    public static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int sum =0;
        while(l<r){
            sum = arr[l]+arr[r];
            if(sum==target){
                return new int[]{l, r};
            }else if(sum>target){
                r--;
            }else{
                l++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 8;
        System.out.println("The indices of the two numbers that add up to " + target + " are: " + Arrays.toString(twoSum(arr, target)));
    }
}
