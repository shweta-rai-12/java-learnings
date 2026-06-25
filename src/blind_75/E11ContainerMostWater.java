package blind_75;

public class E11ContainerMostWater {
    /**
     * You are given an array where each element represents the height of a vertical line.
     * Find the area that holds the most water.
     * @param arr
     * @return
     */
    public static int maxWater(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        int left=0,right=arr.length-1;
        int max =0;
        while(left<right){
            int area = Math.min(arr[left],arr[right])*(right-left);
            max = Math.max(area, max);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(" The maximum amount of water that can be contained between two lines is: "+ maxWater(arr));
    }
}
