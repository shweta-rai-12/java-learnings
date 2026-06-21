package dsa.templates.twoPointerPattern;

import java.util.Arrays;

public class SquareOfSortedArray {

    /**
     * We will get the square of the elements of the sorted array,
     * then sorted the squares
     */
    public static int[] square(int[] arr){
        int l=0, r=arr.length-1;
        int pos = arr.length-1;
        while(l<r){
            int leftSq = arr[l]*arr[l];
            int rightSq = arr[r]*arr[r];
            if(leftSq>rightSq){
                arr[pos] = leftSq;
                l++;
            }else{
                arr[pos] = rightSq;
                r--;
            }
            pos--;
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[] = {-4,-2,0,3,10};
        System.out.println("The squares of the sorted array are : "+ Arrays.toString(square(arr)));
    }
}
