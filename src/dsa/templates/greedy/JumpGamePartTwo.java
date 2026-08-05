package dsa.templates.greedy;

public class JumpGamePartTwo {

    /**
     * Jump-Game problem part 2 : Minimum number of jumps to reach the end of the array.
     * Given an array of non-negative integers, where each element represents the maximum
     * jump length at that position, determine the minimum number of jumps required to
     * reach the last index starting from the first index.
     * If it is not possible to reach the end, return -1.
     * @param index
     * @param arr
     * @return
     */
    public static int jump(int index, int[] arr) {

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println("The minimum number of jumps to reach the end of the array: "+jump(arr.length-1, arr));
    }
}
