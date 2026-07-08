package dsa.searching;

public class BinarySearch {

    // Optimal Solution -Time C- O(log n) // Space C- O(1)
    public static int binarySearch(int[] num,int val){
        int left = 0;
        int right = num.length-1;
        while(left<=right){
            int mid =left+(right-left)/2;
            if(num[mid]==val)
                return mid;
            else if(num[mid]>val)
                right = mid-1;
            else
                left = mid+1;
        }
        return -1; // Value not found
    }


    // Via Recursion
    public static int binarySearch2(int[] num,int val, int left, int right){
        while(left<=right){
            int mid =left+(right-left)/2;
            if(num[mid]==val)
                return mid;
            else if(num[mid]>val)
                return binarySearch2(num,val,left,mid-1);
            else
                return binarySearch2(num,val,mid+1,right);
        }
        return -1; // Value not found
    }

    public static void main(String[] args){
        // Array should be sorted for Binary
        int[] arr = {2,3,4,5,6,7,8,9};
        int value = 8;

        System.out.println("Index of " + value + " is: " + binarySearch(arr, value));
        System.out.println("Index of " + value + " is: " + binarySearch2(arr, value, 0, arr.length-1) );
    }
}
