package dsa.templates.twoPointerPattern;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2, 2, 3, 4,4, 5};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0)
            System.out.println("Array is empty");

        System.out.println(" The Original array is: " + Arrays.toString(arr));

        // Using Set
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("The arry with no duplicates " +set.toString());
        System.out.println("The length of the array with no duplicates " + set.size());
        System.out.println("The duplicate size " + (arr.length-set.size()));

        // Using Two Pointer
        int slow = 0;
        int len = arr.length;
        for (int fast = 1; fast < len; fast++) {
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        System.out.println("The arry with no duplicates " +Arrays.toString(Arrays.copyOfRange(arr, 0, slow+1)));
        System.out.println("The length of the array with no duplicates " + (slow+1));
        System.out.println("The duplicate size " + (arr.length-(slow+1)));

    }
}
