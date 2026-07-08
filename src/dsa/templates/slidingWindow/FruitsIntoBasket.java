package dsa.templates.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FruitsIntoBasket {


    /**
     * Fruits into basket problem : The maximum no.of fruits you can add to two baskets should be only of 2 types
     * consecutively.
     * Assume it as Max Sub Array with at most 2 types of fruits
     * @param arr
     * @return
     */
    // Optimal Solution - Sliding Window TC-O(N)
    public static int totalFruitsSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int l=0,r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.size()>2){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }

        return max;
    }

    // Most Optimal Solution - Sliding Window TC-O(N)
    public static int totalFruitsSubArray1(int[] arr) {
        int max=Integer.MIN_VALUE;
        int l=0,r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.size()>2){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }

        return max;
    }

    // Brute-force TC-O(N^2)
    public static int totalFruitsSubArray2(int[] fruits){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<fruits.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<fruits.length;j++){
                set.add(fruits[j]);
                if(set.size()<=2){
                    max=Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] fruits = {3,3,1,2,2,2,4,4,4,3,1,1,1,3};
        System.out.println("The maximum number of fruits that can be collected in two baskets is: " + totalFruitsSubArray(fruits));
        System.out.println("The maximum number of fruits that can be collected in two baskets is: " + totalFruitsSubArray2(fruits));
    }
}
