package blind_75;

import java.util.Arrays;
import java.util.HashSet;

public class I217ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1};
        System.out.println("Does the array contain duplicates? " + containsDuplicate(nums));
    }
}
