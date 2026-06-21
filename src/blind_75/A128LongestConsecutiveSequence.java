package blind_75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A128LongestConsecutiveSequence {

    // Brute force approach: O(n^2)
    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i]+1;
            for (int j = i+1; j < nums.length; j++) {
                if (value == nums[j]) {
                    longest = Math.max(longest, j-i+1);
                    value ++;
                }
            }
        }
        return longest;
    }

    //Better
    public static int longestConsecutive2(int[] nums) {
        int length = 0, counter = 1;
        Arrays.sort(nums);
        int lastSmallest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 == lastSmallest) {
                lastSmallest = nums[i];
                counter++;
            }else if (nums[i]!=lastSmallest) {
                lastSmallest = nums[i];
                counter =1;
            }
            length = Math.max(length, counter);
        }
        return length;
    }

    //optimal
    public static int longestConsecutive3(int[] nums) {
        int size = nums.length;
        if (size == 0) return 0;
        // Add all numbers to the set
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;
        // For each number that is the start of a sequence (no predecessor),
        // count the length of the consecutive sequence.
        for (int num : set) {
            if (!set.contains(num - 1)) { // start of sequence
                int current = num;
                int streak = 1;
                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] num = {100,2,101,3,0,71,1,6,7,8,102,5,4,103,104,105,106,107};
        System.out.println("The length of the longest consecutive sequence is: " + longestConsecutive(num));
        System.out.println("The length of the longest consecutive sequence is: " + longestConsecutive2(num));
        System.out.println("The length of the longest consecutive sequence is: " + longestConsecutive3(num));
    }
}
