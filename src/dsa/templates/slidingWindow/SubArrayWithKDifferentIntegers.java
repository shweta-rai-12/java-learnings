package dsa.templates.slidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArrayWithKDifferentIntegers {

    public static int countSubArrays(int[] arr, int k) {
        if (k < 0) return 0;

        int l = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < arr.length; r++) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }

            ans += r - l + 1;
        }

        return ans;
    }

    public static void main(String[] args){
        int arr[] = {2,1,1,1,3,4,3,2};
        int k=3;
        int subArrays = countSubArrays(arr,k)-countSubArrays(arr,k-1);
        System.out.println("The number of SubArray with " + k + " different integers is: " + subArrays);
    }
}
