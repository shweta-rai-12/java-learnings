package dsa.templates.twoPointerPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,-2,1,0,2};
        System.out.println("The triplets are : "+threeSum(arr).toString());
    }

    public static List<List<Integer>> threeSum(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>>  res = new ArrayList<>();
        for(int i = 0; i < n-2; i++){
            int left = 1, right = n-1;
            while(left<right){
                if(arr[i]+arr[left]+arr[right]==0){
                    res.add(Arrays.asList(arr[i],arr[left],arr[right]));
                }else if(arr[i]+arr[left]+arr[right]>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;
    }
}
