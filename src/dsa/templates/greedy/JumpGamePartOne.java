package dsa.templates.greedy;

public class JumpGamePartOne {

    /** Jump-Game problem : The value at each index is the max limit it can jump forward.
     *  We need to find if we can jump to the end of the array or not.
     *
     */
    public static boolean canJump(int[] nums) {
        int maxJumpIndex =0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > maxJumpIndex) {
                return false;
            }
            maxJumpIndex = Math.max(maxJumpIndex, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {1,2,4,1,0,2,5,7,8};
        System.out.println("Can I jump to the end of the array? "+canJump(nums));
    }
}
