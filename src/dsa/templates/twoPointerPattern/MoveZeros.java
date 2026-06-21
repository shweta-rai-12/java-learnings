package dsa.templates.twoPointerPattern;

import java.util.Arrays;

public class MoveZeros {

    public static int[] moveZeroes(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int slow = 0;
        for (int fast = 0; fast <= arr.length - 1; fast++) {
            if(arr[fast]!=0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,45,7,0,1,0,0,1,23,4};
        System.out.println("Original array:"+ Arrays.toString(arr));
        System.out.println("Array after moving zeroes to the end:"+ Arrays.toString(moveZeroes(arr)));
    }
}
